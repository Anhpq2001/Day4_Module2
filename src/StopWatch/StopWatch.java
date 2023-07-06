package StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(long start){
        this.startTime = start;
    }
    public void stop(long stop){
        this.endTime = stop;
    }
    public void getElapsedTime(){

    }
}
