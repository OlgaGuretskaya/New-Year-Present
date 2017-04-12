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
        System.out.println("  ");
        System.out.println("Собранный подарок в Linkedlist:" + linkedList);
        System.out.println("Есть ли элемент 'Милка' в списке:" + linkedList.contains("Милка"));
        System.out.println("Элемент из списка по индексу 3:" + linkedList.get(3));
        System.out.println("Удалить элемент из списка с индексом 8:" + linkedList.remove(8));
        System.out.println("Размер после удаления:" + linkedList.size());
        linkedList.add(88, "Семечки");
        System.out.println("Linkedlist c добавленным элементом 'Семечки' с индексом 88:" + linkedList);
        System.out.println("Размер после добавления:" + linkedList.size());
        long endTime = timeCalculation.currentTimeMillis();
        timeCalculation.timeCalculation(startTime, endTime);
    }
    catch(NullPointerException e){
      new ExceptionNullPointer().getExceptionNullPointer();

    }

    catch (IndexOutOfBoundsException e) {
        new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforList(list);


    }


    }
}
