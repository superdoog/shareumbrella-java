package com.shareumbrella.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shareumbrella.entity.Point;
import com.shareumbrella.mapper.PointMapper;
import com.shareumbrella.service.IPointService;
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
public class PointServiceImpl extends ServiceImpl<PointMapper, Point> implements IPointService {

}
