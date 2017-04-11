package collectionsWorkers;

import timeCalculation.TimeCalculation;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForTreeMap {

    TimeCalculation timeCalculation = new TimeCalculation();

    public void createPresentUsingTreeMap(Map hashMap) {

        try {
            Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);

            long startTime = timeCalculation.currentTimeMillis();
            System.out.println(" ");
            System.out.println("Собранный подарок в TreeMap list:" + treeMap);
            System.out.println("Элемент из списка по индексу 3:" + treeMap.get(3));
            System.out.println("Есть ли элемент 'Милка' в списке:" + treeMap.containsValue("Милка"));
            System.out.println("Удалить элемент из списка с индексом 2:" + treeMap.remove(2));
            System.out.println("Размер после удаления:" + treeMap.size());
            treeMap.put(88, "Наклейка");
            System.out.println("TreeMap c добавленным элементом 'Наклейка' с индексом 88:" + treeMap);
            System.out.println("Размер после добавления:" + treeMap.size());
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime);
        }
        catch(NullPointerException e){
            System.out.println("Нет листа!");

        }



    }
}
