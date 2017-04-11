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
import java.util.Random;

/**
 * Created by volha_huretskaya on 4/7/17.
 */
public class CreationPresentByTypingWeight {
    /**
     * Created by volha_huretskaya on 4/5/17.
     */


        Present present = new Present();
        Writer writer = new Writer();
        Reader reader = new Reader();
        Converter converter = new Converter();
        Sweets sweets;


        public void createPresentByTypingWeight() {

           ArrayList<String> presentArray = null;

            writer.writeWeightForPresent();
            String weight = reader.readString();
            present.setTotalWeight(converter.convertStringToInt(weight));
            int totalWeight = present.getTotalWeight();

            int presentWeight = 0;
            while (presentWeight < totalWeight) {
                Random random = new Random();
                int i = random.nextInt(3) + 1;
                switch (i) {
                    case 1:
                        sweets = new Biscuit();
                        break;
                    case 2:
                        sweets = new Chocolate();
                        break;
                    case 3:
                        sweets = new Candy();
                        break;
                }
                presentWeight = presentWeight + sweets.addToPresentUsingArrayList(present);

            }


            System.out.println("Собранный подарок исзодя из веса:" + present.getPresentArray());
            System.out.println("Размер собранного подарка исзодя из веса:" + present.getPresentArray().size());




        }

    }


