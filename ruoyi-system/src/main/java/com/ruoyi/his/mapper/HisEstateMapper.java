package com.ruoyi.his.mapper;

import com.ruoyi.his.domain.HisEstate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface HisEstateMapper {

    /**
     * 查询物业数据集合
     *
     * @param estate 物业信息
     * @return 物业数据集合
     */
    public List<HisEstate> selectEstateList(HisEstate estate);

    /**
     * 查询所有物资
     *
     * @return 物资列表
     */
    public List<HisEstate> selectEstateAll();

    /**
     * 通过物资ID查询物资信息
     *
     * @param estateId 物资ID
     * @return 角色对象信息
     */
    public HisEstate selectEstateById(Long estateId);

    /**
     * 根据用户ID获取物资选择框列表
     *
     * @param userId 用户ID
     * @return 选中物资ID列表
     */
    public List<Long> selectEstateListByUserId(Long userId);

    /**
     * 查询用户所属物资组
     *
     * @param userName 用户名
     * @return 结果
     */
    public List<HisEstate> selectPostsByUserName(String userName);

    /**
     * 新增物资信息
     *
     * @param estate 物业信息
     * @return 结果
     */
    public int insertEstate(HisEstate estate);

    /**
     * 校验物资信息
     */

    public HisEstate checkEstateNameUnique(String estateName);


    /**
     * 校验物资编码
     *
     * @param estateCode 物资编码
     * @return 结果
     */
    public HisEstate checkEstateCodeUnique(String estateCode);


    /**
     * 删除物资信息
     *
     * @param estateId 物资ID
     * @return 结果
     */
    public int deleteEstateById(Long estateId);

    /**
     * 批量删除物资信息
     *
     * @param estateIds 需要删除的物资ID
     * @return 结果
     */
    public int deleteEstatetByIds(Long[] estateIds);


    /**
     * 修改物资信息
     *
     * @param estate 物资信息
     * @return 结果
     */
    public int updateEstate(HisEstate estate);

}
