import collectionsWorkers.*;
import fileWorker.FileRead;
import fileWorker.FileWriter;
import presentActions.PresentSorting;
import presentActions.SweetSercher;
import presentCreation.CreationPresentByTypingWeight;
import presentCreation.PresentCreationByTypingItemsCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Olga on 21.03.2017.
 */
public class Starter {

    public static void main(String[] args) {
        CreationPresentByTypingWeight creationPresentByTypingWeight = new CreationPresentByTypingWeight();
        PresentCreationByTypingItemsCount presentCreationByTypingItemsCount = new PresentCreationByTypingItemsCount();
        WorkerForArrayList workerForArrayList = new WorkerForArrayList();
        WorkerForLinkedList workerForLinkedList = new WorkerForLinkedList();
        WorkerForHashMap workerForHashMap = new WorkerForHashMap();
        WorkerForHashSet workerForHashSet = new WorkerForHashSet();
        WorkerForTreeMap workerForTreeMap = new WorkerForTreeMap();
        WorkerForTreeSet workerForTreeSet = new WorkerForTreeSet();
        PresentSorting presentSorting = new PresentSorting();
        SweetSercher sweetSercher = new SweetSercher();
        FileWriter fileWriter = new FileWriter();
        FileRead fileReader = new FileRead();
        ChoiceForTypingItemCount choiceForTypingItemCount = new ChoiceForTypingItemCount();

        creationPresentByTypingWeight.createPresentByTypingWeight();
        int presentItems = choiceForTypingItemCount.chooseSourceForCountItems();
        List<String> ourPresent = presentCreationByTypingItemsCount.createPresent(presentItems);
        fileWriter.writeToFile(ourPresent);
        sweetSercher.searchSweet(ourPresent);
        presentSorting.sortPresent(ourPresent);
        workerForArrayList.createPresentUsingArrayList(ourPresent);
        workerForLinkedList.createPresentUsingLinkedList(ourPresent);
        workerForHashSet.createPresentUsingHashSet(ourPresent);
        workerForTreeSet.createPresentUsingTreeSet(ourPresent);
        Map<Integer, String> hashMap = workerForHashMap.createPresentUsingHashMap(ourPresent);
        workerForTreeMap.createPresentUsingTreeMap(hashMap);
    }


}



