package fileWorker;

import converter.Converter;
import exceptions.ExceptionFileNotFound;

import java.io.*;


/**
 * Created by volha_huretskaya on 4/12/17.
 */
public class FileRead {

    Converter converter = new Converter();

    public int readFile() {

        int x = 0;

        try {
            File q = new File("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(q)));
            x = converter.convertStringToInt(br.readLine());

            br.close();
        } catch (IOException e) {
            new ExceptionFileNotFound().getExceptionFileNotFound();
        }

        return x;

    }
}


