package greentrees;
import java.util.ArrayList;
public class AdminStack implements StackInterface {
    private ArrayList<Object> theStack;
    
    public AdminStack() {
        theStack = new ArrayList<>();
    }

    public int size() {
        return theStack.size();
    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public Object pop() {
        if(!theStack.isEmpty()) {
            return theStack.remove(0);
        }
        return null;
    }

    public void push(Object newItem) {
        theStack.add(0, newItem);
    }

    public void emptyStack() {
        theStack.clear();
    }

    public String displayStack() {
        String result = "";
        for(int i = 0; i < theStack.size(); i++) {
            result += theStack.get(i) + "\n";
        }
        return result;
    }
}
