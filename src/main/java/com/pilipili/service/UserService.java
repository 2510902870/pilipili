package com.pilipili.service;

import com.pilipili.entity.User;
import com.pilipili.entity.Video;
import org.apache.ibatis.annotations.Param;

/**
 * Create by misty on 2019/12/24 15:08
 */
public interface UserService {
    /**
     * 根据账号和密码查询用户信息
     * @param account  账号
     * @param password  密码
     * @return
     */
    public User selectUserByAccountAndPwd(String account, String password);

    /**
     * 插入一条用户信息
     * @param user  封装的用户信息
     * @return
     */
    public int insertUser(User user);

    /**
     * 根据用户账号修改信息
     * @param user  用户信息
     * @param account  账号
     * @return
     */
    public int updateUserByAccount(User user,String account);

    /**
     * 根据账号寻找用户
     * @param account  账号
     * @return
     */
    public User selectUserByAccount(String account);

    /**
     * 用户发布视频
     * @param video  视频
     * @param user_id  用户id
     * @param video_id  视频id
     */
    public void insertVideo(Video video, Integer user_id, Integer video_id);

    /**
     * 新增用户喜欢/点赞
     * @param video_id  视频id
     * @param user_id  用户id
     */
    public void insertUserLike(Integer video_id, Integer user_id);

    /**
     * 更新用户点赞
     * @param video_id  视频id
     * @param user_id  用户id
     * @param state  点赞状态
     */
    public void updateUserLike(Integer video_id, Integer user_id, int state);

    /**
     * 新增用户收藏
     * @param video_id  视频id
     * @param user_id  用户id
     */
    public void insertUserCollection(Integer video_id, Integer user_id);

    /**
     * 更新用户点赞状态
     * @param video_id  视频id
     * @param user_id  用户id
     * @param state  收藏状态
     */
    public void updateUserCollection(Integer video_id, Integer user_id, int state);

    /**
     * 用户给视频添加评论
     * @param user_id  用户id
     * @param video_id 视频id
     * @param comment  评论
     */
    public void insertComment(Integer user_id,Integer video_id,String comment);

    /**
     * 回复评论
     * @param user_id  用户id
     * @param video_id  视频id
     * @param comment  评论
     * @param parent_id  要回复评论的id
     */
    public void addComment(Integer user_id,Integer video_id,String comment,Integer parent_id);


    /**
     * 根据用户id和视频id获取点赞状态
     * @param user_id
     * @param video_id
     * @return
     */
    public Integer selectLikeStateByUidAndVid(@Param("user_id") Integer user_id, @Param("video_id") Integer video_id);

    /**
     * 根据用户id和视频id获取收藏状态
     * @param user_id
     * @param video_id
     * @return
     */
    public Integer selectCollectionStateByUidAndVid(@Param("user_id") Integer user_id,@Param("video_id") Integer video_id);

    /**
     * 根据用户id查询用户信息
     * @param user_id
     * @return
     */
    public User selectUserById(Integer user_id);

    public void insertVideo(Video video, Integer user_id, String category_name);


    public int updateUserById(User user, Integer id);
}
