package HomeWork5;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Владислав on 27.10.2016.
 */
public class MyDocFileFilter implements FileFilter {
    String[] names;

    public MyDocFileFilter(String... names) {
        this.names = names;
    }
    public boolean check(String n){
        for (String s:names) {
            if (s.equals(n)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int index = pathname.getName().lastIndexOf(".");
        if (index ==-1){
            return false;
        }
        String text = pathname.getName().substring(index + 1);
        return check(text);
    }
}
