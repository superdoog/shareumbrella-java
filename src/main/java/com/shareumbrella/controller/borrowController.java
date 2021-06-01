package com.shareumbrella.controller;

import com.shareumbrella.entity.Point;
import com.shareumbrella.entity.Umbrella;
import com.shareumbrella.service.IPointService;
import com.shareumbrella.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class borrowController {

    @Autowired
    private IPointService pointService;
    @Autowired
    private IUmbrellaService umbrellaService;

    @GetMapping("/queryAll")
    public Object pointList() {
        return pointService.list();
    }

    @GetMapping("/byPid")
    public Object byPid(Integer pid) {
        return pointService.getById(pid);
    }

    @GetMapping("/borrow")
    public boolean borrow(Integer pid, Integer uid) {
        Point point = pointService.getById(pid);
        point.setStock(point.getStock() - 1);
        boolean flg1 = pointService.updateById(point);
        Umbrella umbrella = umbrellaService.getById(uid);
        umbrella.setPid(0);
        boolean flg2 = umbrellaService.updateById(umbrella);
        if (flg1 && flg2) {
            return false;
        } else {
            return true;
        }
    }
}
