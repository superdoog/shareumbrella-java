package com.shareumbrella.mapper;

import com.shareumbrella.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
@Mapper
public interface UserMapper {

    void add(User user);

    User getById(String openid);
}
