package cap8;

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if (hour < 0  || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Hour, minute and/or second was out of range.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second=second;
    }

    public String toUniversalString(){
        return String.format("%d:%02d:%02d", this.hour, this.minute, this.second);
    }


    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12)? 12: hour%12),minute, second, (hour<12?"AM":"PM"));
    }

}
