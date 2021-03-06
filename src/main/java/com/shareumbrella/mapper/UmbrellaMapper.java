package com.shareumbrella.mapper;

import com.shareumbrella.entity.Umbrella;
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
public interface UmbrellaMapper{

    Umbrella getById(int uid);

    boolean updateMapper(Umbrella umbrella);
}
