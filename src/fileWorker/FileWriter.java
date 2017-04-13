package fileWorker;

import exceptions.ExceptionIO;

import java.util.List;
import java.io.*;

/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class FileWriter {

    public void writeToFile(List<String> list) {



        try {

            File newfile = new File("Present.txt");
            if(newfile.exists()){
                newfile.delete();
            }
            OutputStream file = new FileOutputStream("Present.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(file);
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
            new ExceptionIO().getIOExceptionWriteFile();
        }



    }
}
