package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga on 21.03.2017.
 */
public class CandyData {
    private List<String> candy1;
    private List<String> candy2;
    private List<String> candy3;

    public CandyData() {
        candy1 = new ArrayList<>();
        candy2 = new ArrayList<>();
        candy3 = new ArrayList<>();
        addData();
    }

    public CandyData(List<String> candy1, List<String> candy2, List<String> candy3) {
        this.candy1 = candy1;
        this.candy2 = candy2;
        this.candy3 = candy3;
    }

    public List<String> getCandy1() {
        return candy1;
    }

    public void setCandy1(List<String> candy1) {
        this.candy1 = candy1;
    }

    public List<String> getCandy2() {
        return candy2;
    }

    public void setCandy2(List<String> candy2) {
        this.candy2 = candy2;
    }

    public List<String> getCandy3() {
        return candy3;
    }

    public void setCandy3(List<String> candy3) {
        this.candy3 = candy3;

            }

    @Override
    public String toString() {
        return "CandyData{" +
                "candy1=" + candy1 +
                ", candy2=" + candy2 +
                ", candy3=" + candy3 +
                '}';
    }

    public void addData() {
        candy1.add("Милкивей");
        candy1.add("шоколадные конфеты");
        candy1.add("120");


        candy2.add("Аленка");
        candy2.add("шоколадные конфеты");
        candy2.add("80");


        candy3.add("Суфле");
        candy3.add("конфеты");
        candy3.add("50");

    }
}
