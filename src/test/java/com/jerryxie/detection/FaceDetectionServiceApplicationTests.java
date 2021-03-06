package com.jerryxie.detection;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jerryxie.detection.service.FaceDetectorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FaceDetectionServiceApplicationTests {

    @Autowired
    FaceDetectorService detector;

    @Test
    public void faceDetectorTest() {
        BasicConfigurator.configure();
        File img = new File("/Users/yangyangxie/Desktop/test.jpeg");
        System.out.println(detector.getFaceNum(img));
    }

}
