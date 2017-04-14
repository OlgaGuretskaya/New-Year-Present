package presentActions;

import java.util.Collections;
import java.util.List;


/**
 * Created by volha_huretskaya on 4/10/17.
 */
public class PresentSorting {

    public void sortPresent(List<String> ourPresent) {

        try {
            Collections.sort(ourPresent);

            for (String item : ourPresent) {
            }
            System.out.println("Сортированный подарок по наименованию сладостей:" + ourPresent);
        } catch (NullPointerException e) {
            System.out.println("Нет подарка -> нет сортировки!");
        }
    }
}
