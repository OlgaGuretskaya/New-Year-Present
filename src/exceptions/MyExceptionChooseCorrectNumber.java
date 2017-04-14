package exceptions;

/**
 * Created by volha_huretskaya on 4/14/17.
 */
public class MyExceptionChooseCorrectNumber extends Exception {

    String msg;

    public MyExceptionChooseCorrectNumber(){

        msg = "ВНИМАНИЕ!!! Введите 1 или 2!!!";

    }

    public String getMsg() {
        return msg;
    }
}
