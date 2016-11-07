package Stack;

/**
 * Created by Владислав on 06.11.2016.
 */
public class Stack {
    private Object[] objects = new Object[0];
    private BlackList blackList;
    public void addToStack(Object o){
        Object[] ob = new Object[objects.length+1];
        if(!blackList.thisClassExistInBlackList(o.getClass())){
            for (int i=0; i<ob.length; i++){
                if (ob[i] == null){
                    ob[i] = o;
                    break;
                }else {
                    ob[i+1] = o;
                }

            }}else System.out.println("BlackList include your Class(( SRy");
        ob[ob.length-1] = objects;
    }
    public Object getElementFromStackWithRemove(){
        Object o = null;
        for (int i = objects.length-1; i>=0; i--){
            o = objects[i];
            objects[i] = null;
            break;

        }
        return o;
    }
    public Object getElementFromStack(){
        Object o = null;
        for (int i = objects.length-1; i>=0; i--){
            o = objects[i];
            break;

        }
        return o;
    }
}
