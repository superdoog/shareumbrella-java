package com.shareumbrella.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shareumbrella.entity.Umbrella;
import com.shareumbrella.mapper.UmbrellaMapper;
import com.shareumbrella.service.IUmbrellaService;
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
public class UmbrellaServiceImpl extends ServiceImpl<UmbrellaMapper, Umbrella> implements IUmbrellaService {

}
