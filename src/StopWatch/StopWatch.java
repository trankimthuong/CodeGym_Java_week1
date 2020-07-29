package StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void endtime(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
