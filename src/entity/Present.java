package entity;

import java.util.*;

/**
 * Created by Olga on 21.03.2017.
 */
public class Present {
    private ArrayList<String> presentArray;
    private LinkedList<String> presentLinked;
    private HashSet<String> presentHashSet;
    private TreeSet<String> presentTreeSet;
    private HashMap<Integer, String> presentHashMap;
    private TreeMap<Integer, String> presentTreeMap;

    private int totalWeight;
    private int items;

    public Present() {
    }

    public Present(ArrayList<String> presentArray, LinkedList<String> presentLinked, HashSet<String> presentHashSet, TreeSet<String> presentTreeSet, HashMap<Integer, String> presentHashMap, TreeMap<Integer, String> presentTreeMap, int totalWeight, int items) {
        this.presentArray = presentArray;
        this.presentLinked = presentLinked;
        this.presentHashSet = presentHashSet;
        this.presentTreeSet = presentTreeSet;
        this.presentHashMap = presentHashMap;
        this.presentTreeMap = presentTreeMap;
        this.totalWeight = totalWeight;
        this.items = items;
    }

    public ArrayList<String> getPresentArray() {
        return presentArray;
    }

    public void setPresentArray(ArrayList<String> presentArray) {
        this.presentArray = presentArray;
    }

    public LinkedList<String> getPresentLinked() {
        return presentLinked;
    }

    public void setPresentLinked(LinkedList<String> presentLinked) {
        this.presentLinked = presentLinked;
    }

    public HashSet<String> getPresentHashSet() {
        return presentHashSet;
    }

    public void setPresentHashSet(HashSet<String> presentHashSet) {
        this.presentHashSet = presentHashSet;
    }

    public TreeSet<String> getPresentTreeSet() {
        return presentTreeSet;
    }

    public void setPresentTreeSet(TreeSet<String> presentTreeSet) {
        this.presentTreeSet = presentTreeSet;
    }

    public HashMap<Integer, String> getPresentHashMap() {
        return presentHashMap;
    }

    public void setPresentHashMap(HashMap<Integer, String> presentHashMap) {
        this.presentHashMap = presentHashMap;
    }

    public TreeMap<Integer, String> getPresentTreeMap() {
        return presentTreeMap;
    }

    public void setPresentTreeMap(TreeMap<Integer, String> presentTreeMap) {
        this.presentTreeMap = presentTreeMap;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
}
