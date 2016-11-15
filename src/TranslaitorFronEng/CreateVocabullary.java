package TranslaitorFronEng;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;

/**
 * Created by Владислав on 12.11.2016.
 */
public class CreateVocabullary {
    public HashMap<String,String> vocabul = new HashMap<>();
    public void creating(File fIle){
        String text = "";
        try(BufferedReader bf = new BufferedReader(new FileReader(fIle))){
            while ((text = bf.readLine()) != null){
                String[] textData = text.split(" ");
               String key = textData[0];
                String value = textData[1];
                vocabul.put(key,value);
            }
            System.out.println(vocabul);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public HashMap<String, String> getVocabul() {
        return vocabul;
    }

    public void setVocabul(HashMap<String, String> vocabul) {
        this.vocabul = vocabul;
    }
}
