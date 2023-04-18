package com.autozone.autozone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import vos.DateVO;
import vos.MetricVO;

@RestController
@RequestMapping("dataBase")
public class DataBaseController {
    int failureSearch = 0;
    int responseSearch = 0;
    int throughSearch = 0;

    /*@GetMapping("/database/getfaulire")
    List<MetricVO> getFailureDB(){
        responseSearch = 0;
        throughSearch = 0;
        failureSearch += 1;
        return metrics;
    }
    @GetMapping("/database/getresponse")
    List<MetricVO> getResponseDB(){
        failureSearch = 0;
        throughSearch = 0;
        responseSearch += 1;
        return metrics;
    }
    @GetMapping("/database/getthrough")
    List<MetricVO> getThroughDB(){
        responseSearch = 0;
        failureSearch = 0;
        throughSearch += 1;
        return metrics;
    }*/

    @PostMapping("/database/setmetrics")
    List<MetricVO> setMetricDB(@RequestBody List<MetricVO> metrics){
        System.out.println("Send Metric to DataBase");
        return metrics;
    }
}
