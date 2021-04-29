package com.tr.havelsan.springbootdocker.rest;

import org.gdal.gdal.gdal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GdalService {
    @GetMapping("/test")
    public void testGdal(){
        System.out.println("Test gdal");
        gdal.AllRegister();
        double result = gdal.DecToPackedDMS(12);
        System.out.println("result is :" + result);
    }

}
