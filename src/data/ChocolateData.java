package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga on 21.03.2017.
 */
public class ChocolateData {

    List<String> chocolate1;
    List<String> chocolate2;
    List<String> chocolate3;

    public ChocolateData() {
        chocolate1 = new ArrayList<>();
        chocolate2 = new ArrayList<>();
        chocolate3 = new ArrayList<>();
        addData();
    }

    public List<String> getChocolate1() {
        return chocolate1;
    }

    public void setChocolate1(List<String> chocolate1) {
        this.chocolate1 = chocolate1;
    }

    public List<String> getChocolate2() {
        return chocolate2;
    }

    public void setChocolate2(List<String> chocolate2) {
        this.chocolate2 = chocolate2;
    }

    public List<String> getChocolate3() {
        return chocolate3;
    }

    public void setChocolate3(List<String> chocolate3) {
        this.chocolate3 = chocolate3;
    }

    @Override
    public String toString() {
        return "ChocolateData{" +
                "chocolate1=" + chocolate1 +
                ", chocolate2=" + chocolate2 +
                ", chocolate3=" + chocolate3 +
                '}';
    }

    public void addData() {

        chocolate1.add("Милка");
        chocolate1.add("шоколадка");
        chocolate1.add("100");


        chocolate2.add("Сникерс");
        chocolate2.add("шоколадный батончик");
        chocolate2.add("80");


        chocolate3.add("Альпен Голд");
        chocolate3.add("шоколадка");
        chocolate3.add("100");

    }
}
