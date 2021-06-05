package com.shareumbrella.service;

import com.shareumbrella.entity.Record;

import java.util.List;

public interface IRecordService  {
    List<Record> selectByOpenid(String openid);

    Record selectByOpenidAndUid(Integer uid, String openid);

    boolean save(Record record);

    boolean updateById(Record record);
}
