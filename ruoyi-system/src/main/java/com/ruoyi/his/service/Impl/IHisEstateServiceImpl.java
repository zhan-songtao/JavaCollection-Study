package com.ruoyi.his.service.Impl;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.his.service.IHisEstateService;
import com.ruoyi.his.domain.HisEstate;
import com.ruoyi.his.mapper.HisEstateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IHisEstateServiceImpl implements IHisEstateService {


    @Autowired
    private HisEstateMapper estateMapper;

    /**
     * 查询物业信息集合
     *
     * @param estate 物业信息
     * @return 物业信息集合
     */
    @Override

    public List<HisEstate> selectEstateList(HisEstate estate)
    {
        return estateMapper.selectEstateList(estate);
    }

    /**
     * 查询物资所有列表
     * @return
     */
    @Override
    public List<HisEstate> selectEstateAll(){

        return estateMapper.selectEstateAll();

    }

    @Override
    public HisEstate selectEstateById(Long estateId){
        return estateMapper.selectEstateById(estateId);
    }


    /**
     * 新增保存物资信息
     *
     * @param estate 物资信息
     * @return 结果
     */
    @Override
    public int insertEstate(HisEstate estate){

        return estateMapper.insertEstate(estate);


    }

    /**
     * 校验物资名称是否唯一
     *
     * @param estate 物资信息
     * @return 结果
     */
    @Override
    public String checkEstateNameUnique(HisEstate estate)
    {
        Long estateId = StringUtils.isNull(estate.getestateId()) ? -1L : estate.getestateId();
        HisEstate info = estateMapper.checkEstateNameUnique(estate.getestateName());
        if (StringUtils.isNotNull(info) && info.getestateId().longValue() != estateId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 校验物资名称是否唯一
     *
     * @param estate 物资信息
     * @return 结果
     */
    @Override
    public String checkEstateCodeUnique(HisEstate estate)
    {
        Long estateId = StringUtils.isNull(estate.getestateId()) ? -1L : estate.getestateId();
        HisEstate info = estateMapper.checkEstateCodeUnique(estate.getestateCode());
        if (StringUtils.isNotNull(info) && info.getestateId().longValue() != estateId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }


     @Override
     public int updateEstate(HisEstate estate){

      return estateMapper.updateEstate(estate);

     }
}
