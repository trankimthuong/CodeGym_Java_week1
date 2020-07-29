package StopWatch;

public class test {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(1000);
        stopWatch.endtime();
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }
}
