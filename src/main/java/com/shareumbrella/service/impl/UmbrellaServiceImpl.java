package com.shareumbrella.service.impl;

import com.shareumbrella.entity.Umbrella;
import com.shareumbrella.mapper.UmbrellaMapper;
import com.shareumbrella.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
@Service
@Transactional
public class UmbrellaServiceImpl implements IUmbrellaService {

    @Autowired
    private UmbrellaMapper umbrellaMapper;

    @Override
    public Umbrella getById(int uid) {
        return umbrellaMapper.getById(uid);
    }

    @Override
    public boolean updateById(Umbrella umbrella) {
        return umbrellaMapper.updateMapper(umbrella);
    }
}
