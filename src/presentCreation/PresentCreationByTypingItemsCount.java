package presentCreation;

import converter.Converter;
import entity.Present;

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


    public int typeItemCount() {
        int countItems = 0;
        try {

            writer.writeItemsCount();
            String item = reader.readString();


            countItems = converter.convertStringToInt(item);
            present.setItems(countItems);


        } catch (NumberFormatException e) {
            System.out.println("Введено НЕчисловое значение! Протри глаза и попробуй еще раз!!!");

        }

        return countItems;


    }

    public List<String> createPresent(int presentItems) {
        List<String> ourPresent = new ArrayList<String>();
        try{
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
        System.out.println("Собранный подарок:" + ourPresent);
        System.out.println("Собранный подарок - вес:" + totalWeight);
        }
        catch (NullPointerException e){
            System.out.println("Подарок не собран!");
        }

        return ourPresent;
    }

}
