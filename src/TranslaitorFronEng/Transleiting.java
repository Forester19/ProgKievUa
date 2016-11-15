package TranslaitorFronEng;

import sun.security.x509.AVA;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Владислав on 12.11.2016.
 */
public class Transleiting {
    CreateVocabullary createVocabullary = new CreateVocabullary();
    HashMap<String,String> MyVocabul = createVocabullary.vocabul;
    ArrayList<String> textData = new ArrayList<>();
    ArrayList<String > res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public void readEngFile(File file){
        String textT =" ";
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            while ((textT = bf.readLine()) != null){
                textData.add(textT);
            }
            System.out.println(textData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String trensleit(){
        for (String s: textData){
            s =s.toUpperCase();
            for (char l :s.toCharArray()){
                String res = MyVocabul.get("" + l);
                sb.append(res == null? l:res);
            }
        }
        return sb.toString();


    }
}
