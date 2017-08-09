package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import timeCalculation.TimeCalculation;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/**
 * Используется для измерения скорости работы TreeMap
 */
public class WorkerForTreeMap {

    TimeCalculation timeCalculation = new TimeCalculation();

    /**
     * Метод измерения скорости работы TreeMap
     * @param hashMap
     */
    public void createPresentUsingTreeMap(Map<Integer, String> hashMap) {
        /**
         * TreeMap созданного подарка
         */
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
        try {

            if (hashMap.isEmpty()) {
                throw new NullPointerException();
            }

            long startTime = timeCalculation.currentTimeMillis();

            treeMap.put(88, "Наклейка");

            if (hashMap.get(3) == null) {
                throw new IndexOutOfBoundsException();
            }
            treeMap.get(3);
            treeMap.containsValue("Милка");
            if (hashMap.remove(9) == null) {
                throw new IndexOutOfBoundsException();
            }
            treeMap.remove(9);

            String collectionName = "TreeMap";

            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (IndexOutOfBoundsException e) {

            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforMap(treeMap);

        }
    }


}
