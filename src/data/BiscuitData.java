package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga on 21.03.2017.
 */
public class BiscuitData {
    List<String> biscuit1;
    List<String> biscuit2;
    List<String> biscuit3;

    public BiscuitData() {
        biscuit1 = new ArrayList<>();
        biscuit2 = new ArrayList<>();
        biscuit3 = new ArrayList<>();
        addData();
    }

    public List<String> getBiscuit1() {
        return biscuit1;
    }

    public void setBiscuit1(List<String> biscuit1) {
        this.biscuit1 = biscuit1;
    }

    public List<String> getBiscuit2() {
        return biscuit2;
    }

    public void setBiscuit2(List<String> biscuit2) {
        this.biscuit2 = biscuit2;
    }

    public List<String> getBiscuit3() {
        return biscuit3;
    }

    public void setBiscuit3(List<String> biscuit3) {
        this.biscuit3 = biscuit3;
    }


    @Override
    public String toString() {
        return "BiscuitData{" +
                "biscuit1=" + biscuit1 +
                ", biscuit2=" + biscuit2 +
                ", biscuit3=" + biscuit3 +
                '}';
    }

    public void addData() {

        biscuit1.add("Коммунарка");
        biscuit1.add("печенье");
        biscuit1.add("70");


        biscuit2.add("Спартак");
        biscuit2.add("печенье");
        biscuit2.add("50");


        biscuit3.add("Слодыч");
        biscuit3.add("пченье");
        biscuit3.add("60");

    }

}
