package collectionsWorkers;

import presentCreation.PresentCreationByTypingItemsCount;
import timeCalculation.TimeCalculation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForHashSet extends PresentCreationByTypingItemsCount {

    TimeCalculation timeCalculation = new TimeCalculation();

    public void createPresentUsingHashSet(List<String> list) {

        try {
            Set<String> hashSet = new HashSet<String>(list);

            long startTime = timeCalculation.currentTimeMillis();
            System.out.println("  ");
            System.out.println("Собранный подарок в HashSet list:" + hashSet);
            System.out.println("Элемент из списка по хеш-коду :" + hashSet.hashCode());
            System.out.println("Есть ли элемент 'Милка' в списке:" + hashSet.contains("Милка"));
            System.out.println("Удалить элемент из списка с индексом 2:" + hashSet.remove(2));
            System.out.println("Размер после удаления:" + hashSet.size());
            hashSet.add("Вафля");
            System.out.println("HashSet c добавленным элементом 'Вафля' с индексом 88:" + hashSet);
            System.out.println("Размер после добавления:" + hashSet.size());
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime);
        }
        catch(NullPointerException e){
            System.out.println("Нет листа!");

        }

            }
}
