package collectionsWorkers;

import exceptions.ExceptionNullPointer;
import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForTreeSet {

    TimeCalculation timeCalculation = new TimeCalculation();


    public void createPresentUsingTreeSet(List<String> list) {

        try {
            Set<String> treeSet = new TreeSet<String>(list);

            long startTime = timeCalculation.currentTimeMillis();

            treeSet.hashCode();
            treeSet.contains("Милка");
            treeSet.remove("Cникерс");
            treeSet.add("Леденец");

            String collectionName = "TreeSet";
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        }
    }
}
