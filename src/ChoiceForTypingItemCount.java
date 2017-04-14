import converter.Converter;
import exceptions.ExceptionNumberFormat;
import exceptions.MyExceptionChooseCorrectNumber;
import fileWorker.FileRead;
import presentCreation.PresentCreationByTypingItemsCount;
import reader.Reader;
import writer.Writer;

/**
 * Created by volha_huretskaya on 4/14/17.
 */
public class ChoiceForTypingItemCount {

    Writer writer = new Writer();
    Reader reader = new Reader();
    Converter converter = new Converter();
    PresentCreationByTypingItemsCount presentCreationByTypingItemsCount = new PresentCreationByTypingItemsCount();
    FileRead fileRead = new FileRead();
    int itemCount;

    public int chooseSourceForCountItems() {

        try {
            writer.chooseSourseForItemCount();
            String sourceCountItem = reader.readString();
            int source = converter.convertStringToInt(sourceCountItem);

            if (source != 1 & source != 2) {
                throw new MyExceptionChooseCorrectNumber();
            }

            if (source == 1) {
                itemCount = presentCreationByTypingItemsCount.typeItemCount();
            } else {
                itemCount = fileRead.readFile();
            }

        } catch (NumberFormatException e) {
            new ExceptionNumberFormat().getExceptionNumberFormat();

        } catch (MyExceptionChooseCorrectNumber e) {
            System.out.println(new MyExceptionChooseCorrectNumber().getMsg());
        }

        return itemCount;
    }
}
