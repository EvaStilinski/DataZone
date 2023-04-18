package vos;

public class DateVO {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public DateVO(){}

    public DateVO (int year, int month, int day, int hour, int minute){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    //2023-02-13T00:00:00.000-06:00

    public String getDate(){
        String temp = Integer.toString(this.year)+"-"+Integer.toString(this.month)+"-"+Integer.toString(this.day)+"T";
        temp += Integer.toString(this.hour)+":"+Integer.toString(this.minute)+":00.000-06.00";
        return temp;
    }
}
