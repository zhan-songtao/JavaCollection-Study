package com.ruoyi.web.controller.his;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.his.service.IHisEstateService;
import com.ruoyi.his.domain.HisEstate;
import com.ruoyi.his.service.IHisEstateService;
import com.ruoyi.system.domain.SysPost;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.ELState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ruoyi.common.core.domain.AjaxResult.error;
import static com.ruoyi.common.utils.PageUtils.startPage;
import static com.ruoyi.common.utils.SecurityUtils.getUsername;

@RestController
@RequestMapping("/his/estate")
public class HisEstateController extends BaseController {


    @Autowired
    private IHisEstateService iHisEstateService;

    /**
     * 获取物业列表
     */
    @PreAuthorize("@ss.hasPermi('his:estate:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisEstate estate) {
        startPage();
        List<HisEstate> list = iHisEstateService.selectEstateList(estate);
        return getDataTable(list);
    }

    /**
     * 根据物资编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:estate:query')")
    @GetMapping(value = "/{estateId}")
    public AjaxResult getInfo(@PathVariable Long estateId)
    {
        return success(iHisEstateService.selectEstateById(estateId));
    }


    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected TableDataInfo getDataTable(List<?> list) {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    /**
     * 新增物业信息
     */

    /**
     * 新增物业
     */
    @PreAuthorize("@ss.hasPermi('his:estate:add')")
    @Log(title = "物业管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody HisEstate estate)
    {
        if (UserConstants.NOT_UNIQUE.equals(iHisEstateService.checkEstateNameUnique(estate)))
        {
            return error("新增物业'" + estate.getestateName() + "'失败，物业名称已存在");
        }
        else if (UserConstants.NOT_UNIQUE.equals(iHisEstateService.checkEstateCodeUnique(estate)))
        {
            return error("新增物业'" + estate.getestateCode() + "'失败，物业编码已存在");
        }
        estate.setCreateBy(getUsername());
        return toAjax(iHisEstateService.insertEstate(estate));
    }

    /**
     * 修改物资
     */
    @PreAuthorize("@ss.hasPermi('his:estate:edit')")
    @Log(title = "物资管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody HisEstate estate)
    {
        if (UserConstants.NOT_UNIQUE.equals(iHisEstateService.checkEstateNameUnique(estate)))
        {
            return error("修改物资'" + estate.getestateName() + "'失败，物资名称已存在");
        }
        else if (UserConstants.NOT_UNIQUE.equals(iHisEstateService.checkEstateCodeUnique(estate)))
        {
            return error("修改物资'" + estate.getestateName() + "'失败，物资编码已存在");
        }
        estate.setUpdateBy(getUsername());
        return toAjax(iHisEstateService.updateEstate(estate));
    }
    
}
