package com.ruoyi.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ruoyi.common.core.domain.entity.SysMenu;

/**
 * 物资表 数据层
 *
 * @author ruoyi
 */
public interface SysMenuMapper
{
    /**
     * 查询系统物资列表
     *
     * @param menu 物资信息
     * @return 物资列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu);

    /**
     * 根据用户所有权限
     *
     * @return 权限列表
     */
    public List<String> selectMenuPerms();

    /**
     * 根据用户查询系统物资列表
     *
     * @param menu 物资信息
     * @return 物资列表
     */
    public List<SysMenu> selectMenuListByUserId(SysMenu menu);

    /**
     * 根据角色ID查询权限
     * 
     * @param roleId 角色ID
     * @return 权限列表
     */
    public List<String> selectMenuPermsByRoleId(Long roleId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<String> selectMenuPermsByUserId(Long userId);

    /**
     * 根据用户ID查询物资
     *
     * @return 物资列表
     */
    public List<SysMenu> selectMenuTreeAll();

    /**
     * 根据用户ID查询物资
     *
     * @param userId 用户ID
     * @return 物资列表
     */
    public List<SysMenu> selectMenuTreeByUserId(Long userId);

    /**
     * 根据角色ID查询物资树信息
     * 
     * @param roleId 角色ID
     * @param menuCheckStrictly 物资树选择项是否关联显示
     * @return 选中物资列表
     */
    public List<Long> selectMenuListByRoleId(@Param("roleId") Long roleId, @Param("menuCheckStrictly") boolean menuCheckStrictly);

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
     * @return 结果
     */
    public int hasChildByMenuId(Long menuId);

    /**
     * 新增物资信息
     *
     * @param menu 物资信息
     * @return 结果
     */
    public int insertMenu(SysMenu menu);

    /**
     * 修改物资信息
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
     * @param menuName 物资名称
     * @param parentId 父物资ID
     * @return 结果
     */
    public SysMenu checkMenuNameUnique(@Param("menuName") String menuName, @Param("parentId") Long parentId);
}
