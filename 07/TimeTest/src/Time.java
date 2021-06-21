public class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour <0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(hour <0 || hour > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(hour <0 || hour > 59) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return   hour +" : " +minute+" : " + second;
    }
}
