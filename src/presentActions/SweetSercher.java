package presentActions;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;

import java.util.List;

/**
 * Created by volha_huretskaya on 4/10/17.
 */
public class SweetSercher {

    public void searchSweet(List<String> ourPresent) {
        try {

            System.out.println("Найти элемент с индексом 56:" + ourPresent.get(56));

        } catch (IndexOutOfBoundsException e) {
            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforSweetSearcher(ourPresent);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();
        }

    }
}
