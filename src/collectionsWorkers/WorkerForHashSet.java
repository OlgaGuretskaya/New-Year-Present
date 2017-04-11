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
    ExceptionNullPointer exceptionNullPointer = new ExceptionNullPointer();


    public void createPresentUsingHashSet(List<String> list) {


        try {

            Set<String> hashSet = new HashSet<String>(list);
            long startTime = timeCalculation.currentTimeMillis();
            System.out.println("  ");
            System.out.println("Собранный подарок в HashSet list:" + hashSet);
            System.out.println("Элемент из списка по хеш-коду :" + hashSet.hashCode());
            System.out.println("Есть ли элемент 'Милка' в списке:" + hashSet.contains("Милка"));
            System.out.println("Удалить элемент Сникерс из списка:" + hashSet.remove("Сникерс"));
            System.out.println("Размер после удаления:" + hashSet.size());
            hashSet.add("Вафля");
            System.out.println("HashSet c добавленным элементом 'Вафля':" + hashSet);
            System.out.println("Размер после добавления:" + hashSet.size());
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime);
        }
        catch (NullPointerException e) {
           exceptionNullPointer.getExceptionNullPointer();

        }
    }
}