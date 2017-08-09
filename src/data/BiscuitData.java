package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Содержит данные для сбора подарка
 */
public class BiscuitData {

    List<String> biscuit1;
    List<String> biscuit2;
    List<String> biscuit3;

    /**
     * Конструктор с параметрами
     */
    public BiscuitData() {
        biscuit1 = new ArrayList<>();
        biscuit2 = new ArrayList<>();
        biscuit3 = new ArrayList<>();
        addData();
    }

    /**
     * Метод get для листа biscuit1;
     * @return
     */
    public List<String> getBiscuit1() {
        return biscuit1;
    }
    /**
     * Метод get для листа biscuit1;
     * @param biscuit1
     */
    public void setBiscuit1(List<String> biscuit1) {
        this.biscuit1 = biscuit1;
    }
    /**
     * Метод get для листа biscuit2;
     * @return
     */
    public List<String> getBiscuit2() {
        return biscuit2;
    }
    /**
     * Метод get для листа biscuit2;
     * @param biscuit2
     */
    public void setBiscuit2(List<String> biscuit2) {
        this.biscuit2 = biscuit2;
    }
    /**
     * Метод get для листа biscuit3;
     * @return
     */
    public List<String> getBiscuit3() {
        return biscuit3;
    }
    /**
     * Метод get для листа biscuit2;
     * @param biscuit3
     */
    public void setBiscuit3(List<String> biscuit3) {
        this.biscuit3 = biscuit3;
    }

    /**
     * Метод вывода листов
     * @return
     */
    @Override
    public String toString() {
        return "BiscuitData{" +
                "biscuit1=" + biscuit1 +
                ", biscuit2=" + biscuit2 +
                ", biscuit3=" + biscuit3 +
                '}';
    }

    /**
     * Метод с элементами и их атрибутами для сбора подарка
     */
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
