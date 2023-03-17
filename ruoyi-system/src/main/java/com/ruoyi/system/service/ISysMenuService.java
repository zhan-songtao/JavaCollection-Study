package com.ruoyi.system.service;

import java.util.List;
import java.util.Set;
import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.core.domain.entity.SysMenu;
import com.ruoyi.system.domain.vo.RouterVo;

/**
 * 物资 业务层
 * 
 * @author ruoyi
 */
public interface ISysMenuService
{
    /**
     * 根据用户查询系统物资列表
     * 
     * @param userId 用户ID
     * @return 物资列表
     */
    public List<SysMenu> selectMenuList(Long userId);

    /**
     * 根据用户查询系统物资列表
     * 
     * @param menu 物资信息
     * @param userId 用户ID
     * @return 物资列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu, Long userId);

    /**
     * 根据用户ID查询权限
     * 
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectMenuPermsByUserId(Long userId);

    /**
     * 根据角色ID查询权限
     * 
     * @param roleId 角色ID
     * @return 权限列表
     */
    public Set<String> selectMenuPermsByRoleId(Long roleId);

    /**
     * 根据用户ID查询物资树信息
     * 
     * @param userId 用户ID
     * @return 物资列表
     */
    public List<SysMenu> selectMenuTreeByUserId(Long userId);

    /**
     * 根据角色ID查询物资树信息
     * 
     * @param roleId 角色ID
     * @return 选中物资列表
     */
    public List<Long> selectMenuListByRoleId(Long roleId);

    /**
     * 构建前端路由所需要的物资
     * 
     * @param menus 物资列表
     * @return 路由列表
     */
    public List<RouterVo> buildMenus(List<SysMenu> menus);

    /**
     * 构建前端所需要树结构
     * 
     * @param menus 物资列表
     * @return 树结构列表
     */
    public List<SysMenu> buildMenuTree(List<SysMenu> menus);

    /**
     * 构建前端所需要下拉树结构
     * 
     * @param menus 物资列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildMenuTreeSelect(List<SysMenu> menus);

    /**
     * 根据物资ID查询信息
     * 
     * @param menuId 物资ID
     * @return 物资信息
     */
    public SysMenu selectMenuById(Long menuId);

    /**
     * 是否存在物资子节点
     * 
     * @param menuId 物资ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean hasChildByMenuId(Long menuId);

    /**
     * 查询物资是否存在角色
     * 
     * @param menuId 物资ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean checkMenuExistRole(Long menuId);

    /**
     * 新增保存物资信息
     * 
     * @param menu 物资信息
     * @return 结果
     */
    public int insertMenu(SysMenu menu);

    /**
     * 修改保存物资信息
     * 
     * @param menu 物资信息
     * @return 结果
     */
    public int updateMenu(SysMenu menu);

    /**
     * 删除物资管理信息
     * 
     * @param menuId 物资ID
     * @return 结果
     */
    public int deleteMenuById(Long menuId);

    /**
     * 校验物资名称是否唯一
     * 
     * @param menu 物资信息
     * @return 结果
     */
    public String checkMenuNameUnique(SysMenu menu);
}
