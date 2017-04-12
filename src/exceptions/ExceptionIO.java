package exceptions;

/**
 * Created by volha_huretskaya on 4/11/17.
 */
public class ExceptionIO extends Exception{

    public void getIOExceptionWriteFile(){

        System.out.println("Ошибка во время записи файла!");

    }

    public void getIOExceptionReadFile(){

        System.out.println("Ошибка во время чтения файла!");

    }
}
