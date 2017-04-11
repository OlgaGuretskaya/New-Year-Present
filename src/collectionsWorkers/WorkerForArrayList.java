package collectionsWorkers;


import timeCalculation.TimeCalculation;


import java.util.*;

/**
 * Created by Olga on 21.03.2017.
 */
public class WorkerForArrayList {

    TimeCalculation timeCalculation = new TimeCalculation();

    public void createPresentUsingArrayList(List<String> list) {

        try {
            List<String> ourPresent = new ArrayList<String>(list);

            long startTime = timeCalculation.currentTimeMillis();
            System.out.println("Собранный подарок в Arraylist:" + ourPresent);
            System.out.println("Элемент из списка по индексу 3:" + ourPresent.get(3));
            System.out.println("Есть ли элемент 'Милка' в списке:" + ourPresent.contains("Милка"));
            System.out.println("Удалить элемент из списка с индексом 2:" + ourPresent.remove(2));
            System.out.println("Размер после удаления:" + ourPresent.size());
            ourPresent.add(88, "Жвачка");
            System.out.println("Array list c добавленным элементом 'Жвачка' с индексом 88:" + ourPresent);
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime);
        }
        catch(NullPointerException e){
            System.out.println("Нет листа!");
        }



    }

}














