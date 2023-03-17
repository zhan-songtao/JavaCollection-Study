package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.core.domain.entity.SysDept;

/**
 * 小区管理 服务层
 * 
 * @author ruoyi
 */
public interface ISysDeptService
{
    /**
     * 查询小区管理数据
     * 
     * @param dept 小区信息
     * @return 小区信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 查询小区树结构信息
     * 
     * @param dept 小区信息
     * @return 小区树信息集合
     */
    public List<TreeSelect> selectDeptTreeList(SysDept dept);

    /**
     * 构建前端所需要树结构
     * 
     * @param depts 小区列表
     * @return 树结构列表
     */
    public List<SysDept> buildDeptTree(List<SysDept> depts);

    /**
     * 构建前端所需要下拉树结构
     * 
     * @param depts 小区列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildDeptTreeSelect(List<SysDept> depts);

    /**
     * 根据角色ID查询小区树信息
     * 
     * @param roleId 角色ID
     * @return 选中小区列表
     */
    public List<Long> selectDeptListByRoleId(Long roleId);

    /**
     * 根据小区ID查询信息
     * 
     * @param deptId 小区ID
     * @return 小区信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 根据ID查询所有子小区（已完成状态）
     * 
     * @param deptId 小区ID
     * @return 子小区数
     */
    public int selectNormalChildrenDeptById(Long deptId);

    /**
     * 是否存在小区子节点
     * 
     * @param deptId 小区ID
     * @return 结果
     */
    public boolean hasChildByDeptId(Long deptId);

    /**
     * 查询小区是否存在用户
     * 
     * @param deptId 小区ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean checkDeptExistUser(Long deptId);

    /**
     * 校验小区名称是否唯一
     * 
     * @param dept 小区信息
     * @return 结果
     */
    public String checkDeptNameUnique(SysDept dept);

    /**
     * 校验小区是否有数据权限
     * 
     * @param deptId 小区id
     */
    public void checkDeptDataScope(Long deptId);

    /**
     * 新增保存小区信息
     * 
     * @param dept 小区信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改保存小区信息
     * 
     * @param dept 小区信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 删除小区管理信息
     * 
     * @param deptId 小区ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);
}
