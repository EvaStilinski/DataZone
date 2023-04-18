package vos;

import enums.Metric;

public class MetricVO {
    private double value;
    private Metric type;

    public MetricVO(){}

    public MetricVO (double value, Metric type){
        this.value = value;
        this.type = type;
    }

    public double getValue(){
        return value;
    }

    public Metric getMetric(){
        return type;
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setMetric(Metric type){
        this.type = type;
    }
    
}