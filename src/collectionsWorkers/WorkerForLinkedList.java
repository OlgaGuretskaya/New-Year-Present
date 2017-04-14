package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForLinkedList {

    TimeCalculation timeCalculation = new TimeCalculation();


    public void createPresentUsingLinkedList(List<String> list) {

        try {
            List<String> linkedList = new LinkedList<String>(list);
            long startTime = timeCalculation.currentTimeMillis();

            linkedList.contains("Милка");
            linkedList.get(3);
            linkedList.remove(8);
            linkedList.add(88, "Семечки");

            String collectionName = "Linkedlist";
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (IndexOutOfBoundsException e) {
            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforList(list);


        }


    }
}
