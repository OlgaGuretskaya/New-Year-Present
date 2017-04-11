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
    ExceptionNullPointer exceptionNullPointer = new ExceptionNullPointer();

    public void createPresentUsingTreeSet(List<String> list) {

       try {
           Set<String> tree = new TreeSet<String>(list);

           long startTime = timeCalculation.currentTimeMillis();
           System.out.println("  ");
           System.out.println("Собранный подарок в TreeSet list:" + tree);
           System.out.println("Элемент из списка по хеш-коду :" + tree.hashCode());
           System.out.println("Есть ли элемент 'Милка' в списке:" + tree.contains("Милка"));
           System.out.println("Удалить элемент 'Сникерс' из списка:" + tree.remove("Cникерс"));
           System.out.println("Размер после удаления:" + tree.size());
           tree.add("Леденец");
           System.out.println("TreeMap c добавленным элементом 'Леденец':" + tree);
           System.out.println("Размер после добавления:" + tree.size());
           long endTime = timeCalculation.currentTimeMillis();
           timeCalculation.timeCalculation(startTime, endTime);


       }
       catch(NullPointerException e){
           exceptionNullPointer.getExceptionNullPointer();

       }
    }
}
