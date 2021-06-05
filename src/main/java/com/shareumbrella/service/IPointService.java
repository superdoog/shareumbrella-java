package com.shareumbrella.service;

import com.shareumbrella.entity.Point;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
public interface IPointService {

    Point getById(int pid);

    List<Point> queryAll();

    boolean updateById(Point point);
}
