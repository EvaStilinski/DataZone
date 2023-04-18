package com.autozone.autozone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import vos.MetricVO;

@RestController
@RequestMapping("metrics")
public class MetricsController {

    @PostMapping("/sort")
    List<MetricVO> sort(@RequestBody List<MetricVO> metrics){
        System.out.println("Send Sort");
        return metrics;
    }

    @GetMapping("/get")
    double a(){
        return 1;
    }        
    
    //get para agarrar de dynatrace
    //set datos la base de datos
    //get datos de la base de datos

    //la base de datos 
}

