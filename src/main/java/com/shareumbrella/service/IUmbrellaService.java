package com.shareumbrella.service;

import com.shareumbrella.entity.Umbrella;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
public interface IUmbrellaService {

    Umbrella getById(int uid);

    boolean updateById(Umbrella umbrella);
}
