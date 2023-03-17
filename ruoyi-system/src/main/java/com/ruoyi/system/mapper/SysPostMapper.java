package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPost;

/**
 * 物资信息 数据层
 * 
 * @author ruoyi
 */
public interface SysPostMapper
{
    /**
     * 查询物资数据集合
     * 
     * @param post 物资信息
     * @return 物资数据集合
     */
    public List<SysPost> selectPostList(SysPost post);

    /**
     * 查询所有物资
     * 
     * @return 物资列表
     */
    public List<SysPost> selectPostAll();

    /**
     * 通过物资ID查询物资信息
     * 
     * @param postId 物资ID
     * @return 角色对象信息
     */
    public SysPost selectPostById(Long postId);

    /**
     * 根据用户ID获取物资选择框列表
     * 
     * @param userId 用户ID
     * @return 选中物资ID列表
     */
    public List<Long> selectPostListByUserId(Long userId);

    /**
     * 查询用户所属物资组
     * 
     * @param userName 用户名
     * @return 结果
     */
    public List<SysPost> selectPostsByUserName(String userName);

    /**
     * 删除物资信息
     * 
     * @param postId 物资ID
     * @return 结果
     */
    public int deletePostById(Long postId);

    /**
     * 批量删除物资信息
     * 
     * @param postIds 需要删除的物资ID
     * @return 结果
     */
    public int deletePostByIds(Long[] postIds);

    /**
     * 修改物资信息
     * 
     * @param post 物资信息
     * @return 结果
     */
    public int updatePost(SysPost post);

    /**
     * 新增物资信息
     * 
     * @param post 物资信息
     * @return 结果
     */
    public int insertPost(SysPost post);

    /**
     * 校验物资名称
     * 
     * @param postName 物资名称
     * @return 结果
     */
    public SysPost checkPostNameUnique(String postName);

    /**
     * 校验物资编码
     * 
     * @param postCode 物资编码
     * @return 结果
     */
    public SysPost checkPostCodeUnique(String postCode);
}
