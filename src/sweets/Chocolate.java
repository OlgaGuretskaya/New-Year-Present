package sweets;

import converter.Converter;
import data.ChocolateData;
import entity.Present;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Olga on 21.03.2017.
 */
public class Chocolate implements Sweets {
    @Override
    public int addToPresentUsingArrayList(Present present) {
        ChocolateData chocolateData = new ChocolateData();
        List<String> chocolate = null;
        Random random = new Random();
        int i = random.nextInt(3) + 1;
        switch (i) {
            case 1:
                chocolate = chocolateData.getChocolate1();
                break;
            case 2:
                chocolate = chocolateData.getChocolate2();
                break;
            case 3:
                chocolate = chocolateData.getChocolate3();
                break;

        }

        String weight = chocolate.get(2);
        Converter converter = new Converter();
        int chocolateWeight = converter.convertStringToInt(weight);


        ArrayList<String> ourPresent = present.getPresentArray();
        if (ourPresent == null) {
            ourPresent = new ArrayList<>();
        }
        String item = chocolate.get(0);
        ourPresent.add(item);
        present.setPresentArray(ourPresent);

        return chocolateWeight;

    }


}
