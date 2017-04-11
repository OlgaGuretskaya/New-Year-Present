package timeCalculation;

/**
 * Created by volha_huretskaya on 4/6/17.
 */
public class TimeCalculation {


    public long currentTimeMillis(){

        long time = System.currentTimeMillis();
        return time;

    }

    public void timeCalculation(long startTime, long endTime) {
        long timeSpent = endTime - startTime;

        System.out.println("программа выполнялась:" + timeSpent + " миллисекунд");
    }

}
