package presentCreation;

import converter.Converter;
import entity.Present;

import exceptions.ExceptionNullPointer;
import exceptions.ExceptionNumberFormat;
import exceptions.ExceptionOutofMemory;
import exceptions.MyExceptionTypeItemLessThan10000;
import fileWorker.FileRead;
import reader.Reader;
import sweets.Biscuit;
import sweets.Candy;

import sweets.Chocolate;
import sweets.Sweets;
import writer.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by volha_huretskaya on 4/7/17.
 */
public class PresentCreationByTypingItemsCount {

    Present present = new Present();
    Writer writer = new Writer();
    Reader reader = new Reader();
    Converter converter = new Converter();
    Sweets sweets;
    FileRead fileRead = new FileRead();


    public int typeItemCount() {
        int countItems = 0;
        try {
            writer.writeItemsCount();
            String item = reader.readString();
            countItems = converter.convertStringToInt(item);

            if (countItems < 10000) {
                throw new MyExceptionTypeItemLessThan10000();
            }

        } catch (NumberFormatException e) {
            new ExceptionNumberFormat().getExceptionNumberFormat();

        } catch (OutOfMemoryError e) {
            new ExceptionOutofMemory().getExceptionOutofMemory();

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (MyExceptionTypeItemLessThan10000 e) {

            System.out.println(new MyExceptionTypeItemLessThan10000().getMsg());

        }

        return countItems;

    }

    public List<String> createPresent(int presentItems) {
        List<String> ourPresent = new ArrayList<String>();
        try {
            int totalWeight = 0;
            int countItem = 0;
            while (countItem < presentItems) {
                Random random = new Random();
                int i = random.nextInt(3) + 1;
                switch (i) {
                    case 1:
                        sweets = new Biscuit();
                        break;
                    case 2:
                        sweets = new Candy();
                        break;
                    case 3:
                        sweets = new Chocolate();
                        break;
                }
                int weight = sweets.addToPresentUsingArrayList(present);
                totalWeight = weight + totalWeight;

                countItem++;
            }
            ourPresent = present.getPresentArray();

            if (ourPresent.isEmpty()) {
                throw new NullPointerException();

            }
            System.out.println("Собранный подарок:" + ourPresent);
            System.out.println("Вес собранного подарка:" + totalWeight);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();
        }

        return ourPresent;
    }

}
