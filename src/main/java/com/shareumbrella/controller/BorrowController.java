package com.shareumbrella.controller;

import com.shareumbrella.entity.Point;
import com.shareumbrella.entity.Record;
import com.shareumbrella.entity.Umbrella;
import com.shareumbrella.service.IPointService;
import com.shareumbrella.service.IRecordService;
import com.shareumbrella.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrowController {

    @Autowired
    private IPointService pointService;
    @Autowired
    private IUmbrellaService umbrellaService;
    @Autowired
    private IRecordService recordService;

    @GetMapping("/queryAll")
    public Object pointList() {
        return pointService.queryAll();
    }

    @GetMapping("/byPid")
    public Object byPid(int pid) {
        return pointService.getById(pid);
    }

    @PostMapping( "/borrow")
    public boolean borrow(Integer pid, Integer uid, String openid) {
        Point point = pointService.getById(pid);
        point.setStock(point.getStock() - 1);
        boolean flg1 = pointService.updateById(point);
        Umbrella umbrella = umbrellaService.getById(uid);
        umbrella.setPid(0);
        boolean flg2 = umbrellaService.updateById(umbrella);

        Record record = new Record();
        record.setOpenid(openid);
        record.setPid(pid);
        record.setUid(uid);
        boolean flg3 = recordService.save(record);

        if (flg1 && flg2 && flg3) {
            return false;
        } else {
            return true;
        }
    }
}
