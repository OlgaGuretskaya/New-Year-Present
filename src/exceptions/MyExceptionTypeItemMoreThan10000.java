package exceptions;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class MyExceptionTypeItemMoreThan10000 extends Exception{

   String msg;

    public MyExceptionTypeItemMoreThan10000(){

        msg = "ВНИМАНИЕ!!! Введенное значение больше 10000!";

        }

    public String getMsg() {
        return msg;
    }
}


