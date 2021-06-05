package com.shareumbrella.service.impl;

import com.shareumbrella.entity.Point;
import com.shareumbrella.mapper.PointMapper;
import com.shareumbrella.service.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
public class PointServiceImpl implements IPointService {
    @Autowired
    private PointMapper pointMapper;

    @Override
    public Point getById(int pid) {
        return pointMapper.selectById(pid);
    }

    @Override
    public List<Point> queryAll() {
        return pointMapper.queryAll();
    }

    @Override
    public boolean updateById(Point point) {
        return pointMapper.updateById(point);
    }
}
