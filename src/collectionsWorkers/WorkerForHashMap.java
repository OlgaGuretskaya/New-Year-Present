package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import timeCalculation.TimeCalculation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by volha_huretskaya on 4/5/17.
 */
public class WorkerForHashMap {

    TimeCalculation timeCalculation = new TimeCalculation();


    public Map createPresentUsingHashMap(List<String> list) {


        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        try {
            Integer mapKey;

            int i;
            for (i = 0; i < list.size(); i++) {
                mapKey = i;
                String mapItem;
                mapItem = list.get(i);
                hashMap.put(mapKey, mapItem);

            }

            long startTime = timeCalculation.currentTimeMillis();
            System.out.println("   ");
            System.out.println("Собранный подарок в HashMap list:" + hashMap);
            System.out.println("Есть ли элемент 'Милка' в списке:" + hashMap.containsValue("Милка"));
            hashMap.put(88, "Мамба");
            System.out.println("HashMap c добавленным элементом 'Мамба' с индексом 88:" + hashMap);
            if(hashMap.get(3) == null || hashMap.remove(8)== null){
                throw new IndexOutOfBoundsException();
            }
            System.out.println("Элемент из списка по индексу 3:" + hashMap.get(3));

            System.out.println("Удалить элемент из списка с индексом 8:" + hashMap.remove(8));
            System.out.println("Размер после удаления:" + hashMap.size());

            System.out.println("Размер после добавления:" + hashMap.size());
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime);
        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (IndexOutOfBoundsException e) {

            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforMap(hashMap);

        }
        return hashMap;

    }
}

