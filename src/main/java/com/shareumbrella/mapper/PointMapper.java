package com.shareumbrella.mapper;

import com.shareumbrella.entity.Point;
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
public interface PointMapper {

    List<Point> queryAll();

    Point selectById(Integer pid);

    boolean updateById(Point point);
}
