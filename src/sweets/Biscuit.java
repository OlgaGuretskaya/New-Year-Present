package sweets;

import converter.Converter;
import data.BiscuitData;
import entity.Present;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Olga on 21.03.2017.
 */
public class Biscuit implements Sweets {

    @Override
    public int addToPresentUsingArrayList(Present present) {
        BiscuitData biscuitData = new BiscuitData();
        List<String> biscuit = null;


            Random random = new Random();
            int i = random.nextInt(3) + 1;
            switch (i) {
                case 1:
                    biscuit = biscuitData.getBiscuit1();
                    break;
                case 2:
                    biscuit = biscuitData.getBiscuit2();
                    break;
                case 3:
                    biscuit = biscuitData.getBiscuit3();
                    break;
            }

            String weight = biscuit.get(2);
            Converter converter = new Converter();
            int biscuitWeight = converter.convertStringToInt(weight);


            ArrayList<String> ourPresent = present.getPresentArray();
            if (ourPresent == null) {
                ourPresent = new ArrayList<>();
            }
            String item = biscuit.get(0);
            ourPresent.add(item);
            present.setPresentArray(ourPresent);

            return biscuitWeight;



    }



}