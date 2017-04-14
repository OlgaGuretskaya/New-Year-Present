package sweets;

import converter.Converter;
import data.CandyData;
import entity.Present;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Olga on 21.03.2017.
 */
public class Candy implements Sweets {
    @Override
    public int addToPresentUsingArrayList(Present present) {
        CandyData candyData = new CandyData();
        List<String> candy = null;
        Random random = new Random();
        int i = random.nextInt(3) + 1;
        switch (i) {
            case 1:
                candy = candyData.getCandy1();
                break;
            case 2:
                candy = candyData.getCandy2();
                break;
            case 3:
                candy = candyData.getCandy3();
                break;

        }

        String weight = candy.get(2);
        Converter converter = new Converter();
        int candyWeight = converter.convertStringToInt(weight);

        ArrayList<String> ourPresent = present.getPresentArray();
        if (ourPresent == null) {
            ourPresent = new ArrayList<>();
        }
        String item = candy.get(0);
        ourPresent.add(item);
        present.setPresentArray(ourPresent);

        return candyWeight;

    }


}
