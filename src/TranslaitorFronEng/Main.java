package TranslaitorFronEng;

import java.io.File;

/**
 * Created by Владислав on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
  File fileVocabulary = new File("Words.txt");
  File fileEng = new File("Eng.txt");
  File fileUA = new File("UA.txt");
        CreateVocabullary createVocabullary = new CreateVocabullary();
        createVocabullary.creating(fileVocabulary);

        Transleiting transleiting = new Transleiting();
        transleiting.readEngFile(fileEng);
        System.out.println(transleiting.trensleit());
    }
}
