package com.shareumbrella.mapper;

import com.shareumbrella.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
@Mapper
public interface RecordMapper {

    List<Record> selectByOpenid(String openid);

    Record selectByOpenidAndUid(Integer uid, String openid);

    boolean insert(Record record);

    boolean update(Record record);
}
