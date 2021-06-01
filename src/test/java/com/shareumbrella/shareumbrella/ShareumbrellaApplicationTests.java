package com.shareumbrella.shareumbrella;

import com.shareumbrella.entity.Point;
import com.shareumbrella.service.IPointService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShareumbrellaApplicationTests {

	@Autowired
	private IPointService pointService;

	@Test
	void contextLoads() {
		List<Point> points = pointService.list();
		points.forEach(System.out::println);
	}

}
