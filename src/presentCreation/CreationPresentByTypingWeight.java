package presentCreation;

import converter.Converter;
import entity.Present;
import exceptions.ExceptionNullPointer;
import exceptions.ExceptionNumberFormat;
import exceptions.ExceptionOutofMemory;
import exceptions.MyExceptionWeightLessThenForOneItem;
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

           try {
               ArrayList<String> presentArray = null;

               writer.writeWeightForPresent();
               String weight = reader.readString();
               present.setTotalWeight(converter.convertStringToInt(weight));
               int totalWeight = present.getTotalWeight();
                if(totalWeight<50){
                    throw new MyExceptionWeightLessThenForOneItem();

                }

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
            catch (NumberFormatException e){
               new ExceptionNumberFormat().getExceptionNumberFormat();
            }
            catch (OutOfMemoryError e){
                new ExceptionOutofMemory().getExceptionOutofMemory();
            }
           catch (NullPointerException e){
               new ExceptionNullPointer().getExceptionNullPointer();
           }

            catch (MyExceptionWeightLessThenForOneItem e){
               System.out.println(new  MyExceptionWeightLessThenForOneItem().getMsg());
            }


        }

    }


