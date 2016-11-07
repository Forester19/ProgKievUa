package Stack;

/**
 * Created by Владислав on 06.11.2016.
 */
public class BlackList {
    public Object[] bleckList = null;

    public BlackList() {
        bleckList = new Object[0];
    }
    public void addToBlackList(Object o){
        Object[] b = new Object[bleckList.length+1];
        for (int i = 0; i < b.length; i++) {
              if (b[i] == null  ){
                b[i] = o;
            break;
              }
        }
        b[b.length-1] = bleckList;
    }
    public boolean thisClassExistInBlackList(Class c){
        boolean res = false;
        for (Object cl : bleckList){
            if (c == cl.getClass()){
                res = true;
            }
            else res = false;
        }
        return res;
    }

    public Object[] getBleckList() {
        return bleckList;
    }
}
