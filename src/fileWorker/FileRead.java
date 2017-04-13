package fileWorker;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class FileRead {

   /* public void readFile() {

        //File f = new File("itemCount.txt");
        FileInputStream in = null;
        try {
            in = new FileInputStream("itemCount.txt");
            int c;
            while((c = in.read()) != -1){
                System.out.println("file" + c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } */

    /*  public void readFile() {
          File f = new File("/Users/volha_huretskaya/Documents/myProjects/githab/New-Year-Present/src/itemCount.txt");
          BufferedReader br = null;
          try {
              br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

          String line;

          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          } catch (FileNotFoundException e) {
              System.out.println("dddddd");
          } catch (IOException e) {
              System.out.println("dddddd");
          }
      }*/
    public int readFile() {
        int a = 0;
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                a = sc.nextInt();

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       // System.out.println(a);
        return a;
    }
}


