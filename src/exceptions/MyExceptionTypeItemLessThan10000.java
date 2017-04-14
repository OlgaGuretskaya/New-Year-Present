package exceptions;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class MyExceptionTypeItemLessThan10000 extends Exception {

    String msg;

    public MyExceptionTypeItemLessThan10000() {

        msg = "ВНИМАНИЕ!!! Введенное значение меньше 10000!";

    }

    public String getMsg() {
        return msg;
    }
}


