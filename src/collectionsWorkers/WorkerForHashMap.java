package collectionsWorkers;

import timeCalculation.TimeCalculation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForHashMap {

    TimeCalculation timeCalculation = new TimeCalculation();

    public Map createPresentUsingHashMap(List<String> arrayList) {



        Map<Integer, String> hashMap = new HashMap<Integer, String>();
       try {
           Integer mapKey;

           int i;
           for (i = 0; i < arrayList.size(); i++) {
               mapKey = i;
               String mapItem;
               mapItem = arrayList.get(i);
               hashMap.put(mapKey, mapItem);

           }

           long startTime = timeCalculation.currentTimeMillis();
           System.out.println("   ");
           System.out.println("Собранный подарок в HashMap list:" + hashMap);
           System.out.println("Элемент из списка по индексу 3:" + hashMap.get(3));
           System.out.println("Есть ли элемент 'Милка' в списке:" + hashMap.containsValue("Милка"));
           System.out.println("Удалить элемент из списка с индексом 2:" + hashMap.remove(2));
           System.out.println("Размер после удаления:" + hashMap.size());
           hashMap.put(88, "Мамба");
           System.out.println("HashMap c добавленным элементом 'Мамба' с индексом 88:" + hashMap);
           System.out.println("Размер после добавления:" + hashMap.size());
           long endTime = timeCalculation.currentTimeMillis();
           timeCalculation.timeCalculation(startTime, endTime);
       }
       catch(NullPointerException e){
           System.out.println("Нет листа!");

       }

        return hashMap;

    }

}

