package cap8;

public class Time2 {

    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be 0-23.");

        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be 0-59.");

        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Second must be 0-59.");


        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 tempo) {
        this.hour = tempo.getHour();
        this.minute = tempo.getMinute();
        this.second = tempo.getSecond();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be 0-23.");

        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be 0-59.");

        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Second must be 0-59.");


        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be 0-23.");

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minute must be 0-59.");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Second must be 0-59.");
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s", ((getHour()==0 || getHour() ==12)? getHour():getHour()%12), getMinute(), getSecond(), (getHour()<12?"AM":"PM"));
    }


}
