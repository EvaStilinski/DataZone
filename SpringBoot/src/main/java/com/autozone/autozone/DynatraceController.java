package com.autozone.autozone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import vos.DateVO;
import vos.MetricVO;

public class DynatraceController {
    /***DYNATRACE*********************/

    @GetMapping("/dynatrace/getmetrics")
    List<MetricVO> getMetricsDN(@RequestBody DateVO dateI, DateVO dateF){
        //https://txe48196.live.dynatrace.com/api/v2/metrics/query?metricSelector=builtin:service.requestCount.total&from=2023-02-13T00:00:00.000-06:00&to=2023-02-14T00:00:00.000-06:00&entitySelector=entityId(%22SERVICE-753A0BC4A98B4D41%22)&resolution=1m
        
        
        
        return metrics;
    }
}
