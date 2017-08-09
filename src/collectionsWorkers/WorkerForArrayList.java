package collectionsWorkers;


import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import timeCalculation.TimeCalculation;


import java.util.*;

/**
 * Используется для проверки скорости работы ArrayList
 */
public class WorkerForArrayList {

    TimeCalculation timeCalculation = new TimeCalculation();

    /**
     * Метод измерения скорости работы ArrayList
     * @param list
     */
    public void createPresentUsingArrayList(List<String> list) {


        try {
            /**
             * ArrayList созданного подарка
             */
            List<String> ourPresent = new ArrayList<String>(list);
            System.out.println(" ");
            long startTime = timeCalculation.currentTimeMillis();
            ourPresent.contains("Милка");
            ourPresent.get(3);
            ourPresent.remove(8);
            ourPresent.add(88, "Жвачка");
            String collectionName = "Arraylist";
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (IndexOutOfBoundsException e) {
            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforList(list);

        }


    }

}















