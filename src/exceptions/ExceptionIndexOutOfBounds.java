package exceptions;

import java.util.List;
import java.util.Map;

/**
 * Created by volha_huretskaya on 4/11/17.
 */
public class ExceptionIndexOutOfBounds {

    public void getExceptionIndexOutOfBoundsforList(List list) {
        if (list.size() < 4) {
            System.out.println("Невозможно найти элемент с индексом 3!");
        }

        if (list.size() < 9) {
            System.out.println("Невозможно удалить элемент с индексом 8!");
        }

             if (list.size() <= 87) {
            System.out.println("Невозможно добавить элемент с индексом 88!");
        }
    }

    public void getExceptionIndexOutOfBoundsforMap(Map map) {
        if (map.size() < 5) {
           System.out.println("Невозможно найти элемент с индексом 3!");
        }

        if (map.size() < 9) {
            System.out.println("Невозможно удалить элемент с индексом 8!");
        }


    }

}