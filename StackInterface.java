package greentrees;
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public String displayStack();

    public void emptyStack();
}