package com.ruoyi.his.service;

import com.ruoyi.his.domain.HisEstate;
import com.ruoyi.system.domain.SysPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHisEstateService {


    /**
     * 查询物业信息集合
     *
     * @param estate 物业信息
     * @return 物业列表
     */
    public List<HisEstate> selectEstateList(HisEstate estate);

    /**
     * 查询所有物资
     * @return
     */
    public List<HisEstate> selectEstateAll();

    /**
     * 根据Id查询物资
     * @param estateId
     * @return
     */
    public HisEstate selectEstateById(Long estateId);


    /**
     * 新增保存物资信息
     *
     * @param estate 物资信息
     * @return 结果
     */
    public int insertEstate(HisEstate estate);

    /**
     * 校验物资名称
     *
     * @param estate 物资信息
     * @return 结果
     */
    public String checkEstateNameUnique(HisEstate estate);


    /**
     * 校验物资编码
     *
     * @param estate 物资信息
     * @return 结果
     */

     public String checkEstateCodeUnique(HisEstate estate);


    /**
     * 删除物资信息
     *
     * @param estateId 物资ID
     * @return 结果
     */


    /**
     * 修改物资信息
     * @param estate
     * @return
     */
     public int updateEstate(HisEstate estate);


}
