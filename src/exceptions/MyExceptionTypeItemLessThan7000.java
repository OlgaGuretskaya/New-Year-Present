package exceptions;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class MyExceptionTypeItemLessThan7000 extends Exception {

    String msg;

    public MyExceptionTypeItemLessThan7000() {

        msg = "ВНИМАНИЕ!!! Введенное значение меньше 7000!";

    }

    public String getMsg() {
        return msg;
    }
}


