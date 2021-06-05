package com.shareumbrella.service.impl;

import com.shareumbrella.entity.Record;
import com.shareumbrella.mapper.RecordMapper;
import com.shareumbrella.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordServiceImpl implements IRecordService {

    @Autowired
    private RecordMapper recordMapper;

    @Override
    public List<Record> selectByOpenid(String openid) {
        return recordMapper.selectByOpenid(openid);
    }

    @Override
    @Transactional
    public Record selectByOpenidAndUid(Integer uid, String openid) {
        Record record = recordMapper.selectByOpenidAndUid(uid, openid);
        return record;
    }

    @Override
    public boolean save(Record record) {
        return recordMapper.insert(record);
    }

    @Override
    public boolean updateById(Record record) {
        return recordMapper.update(record);
    }
}
