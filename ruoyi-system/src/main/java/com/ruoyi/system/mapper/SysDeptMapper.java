package com.ruoyi.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ruoyi.common.core.domain.entity.SysDept;

/**
 * 小区管理 数据层
 * 
 * @author ruoyi
 */
public interface SysDeptMapper
{
    /**
     * 查询小区管理数据
     * 
     * @param dept 小区信息
     * @return 小区信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 根据角色ID查询小区树信息
     * 
     * @param roleId 角色ID
     * @param deptCheckStrictly 小区树选择项是否关联显示
     * @return 选中小区列表
     */
    public List<Long> selectDeptListByRoleId(@Param("roleId") Long roleId, @Param("deptCheckStrictly") boolean deptCheckStrictly);

    /**
     * 根据小区ID查询信息
     * 
     * @param deptId 小区ID
     * @return 小区信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 根据ID查询所有子小区
     * 
     * @param deptId 小区ID
     * @return 小区列表
     */
    public List<SysDept> selectChildrenDeptById(Long deptId);

    /**
     * 根据ID查询所有子小区（已完成状态）
     * 
     * @param deptId 小区ID
     * @return 子小区数
     */
    public int selectNormalChildrenDeptById(Long deptId);

    /**
     * 是否存在子节点
     * 
     * @param deptId 小区ID
     * @return 结果
     */
    public int hasChildByDeptId(Long deptId);

    /**
     * 查询小区是否存在用户
     * 
     * @param deptId 小区ID
     * @return 结果
     */
    public int checkDeptExistUser(Long deptId);

    /**
     * 校验小区名称是否唯一
     * 
     * @param deptName 小区名称
     * @param parentId 父小区ID
     * @return 结果
     */
    public SysDept checkDeptNameUnique(@Param("deptName") String deptName, @Param("parentId") Long parentId);

    /**
     * 新增小区信息
     * 
     * @param dept 小区信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改小区信息
     * 
     * @param dept 小区信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 修改所在小区已完成状态
     * 
     * @param deptIds 小区ID组
     */
    public void updateDeptStatusNormal(Long[] deptIds);

    /**
     * 修改子元素关系
     * 
     * @param depts 子元素
     * @return 结果
     */
    public int updateDeptChildren(@Param("depts") List<SysDept> depts);

    /**
     * 删除小区管理信息
     * 
     * @param deptId 小区ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);
}
