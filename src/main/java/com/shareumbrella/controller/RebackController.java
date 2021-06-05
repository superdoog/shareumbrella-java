package com.shareumbrella.controller;

import com.shareumbrella.entity.Point;
import com.shareumbrella.entity.Record;
import com.shareumbrella.entity.Umbrella;
import com.shareumbrella.service.IPointService;
import com.shareumbrella.service.IRecordService;
import com.shareumbrella.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RebackController {

    @Autowired
    private IPointService pointService;
    @Autowired
    private IUmbrellaService umbrellaService;
    @Autowired
    private IRecordService recordService;

    @RequestMapping(method = RequestMethod.POST, value = "/reback")
    public boolean reback(String pid, Integer uid, String openid) {
        Point point = pointService.getById(Integer.parseInt(pid));
        System.out.println(point);
        System.out.println(point.getStock());
        point.setStock(point.getStock() + 1);
        boolean flg1 = pointService.updateById(point);
        Umbrella umbrella = umbrellaService.getById(uid);
        umbrella.setPid(Integer.parseInt(pid));
        boolean flg2 = umbrellaService.updateById(umbrella);
        Record record = recordService.selectByOpenidAndUid(uid, openid);
        record.setStatus(1);
        boolean flg3 = recordService.updateById(record);

        if (flg1 && flg2 && flg3) {
            return false;
        } else {
            return true;
        }
    }
}
