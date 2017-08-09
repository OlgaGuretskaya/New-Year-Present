package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.LinkedList;
import java.util.List;

/**
 * Используется для измерения скорости работы LinkedList
 */
public class WorkerForLinkedList {

    TimeCalculation timeCalculation = new TimeCalculation();

    /**
     * Метод измерения скорости работы LinkedList
     * @param list
     */
    public void createPresentUsingLinkedList(List<String> list) {

        try {
            /**
             * LinkedList созданного подарка
             */
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
