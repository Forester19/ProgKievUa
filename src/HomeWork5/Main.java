package HomeWork5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Владислав on 27.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        File file1 = new File("ggg.doc");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyDocFileFilter myDocFileFilter = new MyDocFileFilter("doc");
        File file = new File(".");
        File[] files = file.listFiles(myDocFileFilter);
        for (int i =0; i<files.length; i++){
            System.out.println(files[i]);
        }
    }
}
