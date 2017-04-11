package presentActions;

import java.util.List;

/**
 * Created by volha_huretskaya on 4/10/17.
 */
public class SweetSercher {

    public void searchSweet(List<String> ourPresent){
        try{
    System.out.println("Найти элемент с индексом 56:" + ourPresent.get(56));

    }
    catch (NullPointerException e){
        System.out.println("56 айтема не существует!");
        }
    }

}
