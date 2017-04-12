package fileWorker;

import java.util.List;
import java.io.*;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class FileWriter {

    public void writeToFile(List<String> list) {



        try {
            OutputStream f = new FileOutputStream("Present.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            out.write("Собранный подарок:");
            for(int i = 0; i < list.size(); i++)
            {
                out.write("Item -" + list.get(i) + ";");
                out.flush();
            }

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
