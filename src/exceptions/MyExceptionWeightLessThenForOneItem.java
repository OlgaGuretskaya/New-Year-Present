package exceptions;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class MyExceptionWeightLessThenForOneItem extends Exception {

    String msg;

    public MyExceptionWeightLessThenForOneItem() {

        msg = "ВНИМАНИЕ!!! Введен вес меньше, чем для 1 айтема!";

    }

    public String getMsg() {

        return msg;
    }
}
