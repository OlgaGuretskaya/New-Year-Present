package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Используется для измерения скорости работы HashSet
 */
public class WorkerForHashSet {

    TimeCalculation timeCalculation = new TimeCalculation();

    /**
     * Метод измерения скорости работы HashSet
     * @param list
     */
    public void createPresentUsingHashSet(List<String> list) {


        try {
            /**
             * HashSet созданного подарка
             */
            Set<String> hashSet = new HashSet<String>(list);
            long startTime = timeCalculation.currentTimeMillis();

            hashSet.hashCode();
            hashSet.contains("Милка");
            hashSet.remove("Сникерс");
            hashSet.add("Вафля");

            String collectionName = "HashSet";
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        }
    }
}