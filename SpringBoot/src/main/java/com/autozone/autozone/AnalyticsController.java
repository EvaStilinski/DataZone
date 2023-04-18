package com.autozone.autozone;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import vos.DateVO;

public class AnalyticsController {
    public void connectDN(DateVO initialD, DateVO finalD) throws IOException{
        URL url = new URL("https://txe48196.live.dynatrace.com/api/v2/metrics/query?metricSelector=builtin:service.requestCount.total&from="+initialD.getDate()+"&to="+finalD.getDate()+"&entitySelector=entityId(%22SERVICE-753A0BC4A98B4D41%22)&resolution=1m");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        
    }
}
