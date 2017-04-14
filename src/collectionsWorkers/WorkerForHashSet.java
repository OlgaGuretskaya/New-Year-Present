package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForHashSet {

    TimeCalculation timeCalculation = new TimeCalculation();


    public void createPresentUsingHashSet(List<String> list) {


        try {

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