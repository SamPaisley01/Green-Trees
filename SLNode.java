package greentrees;
public class SLNode {
    private Object element;
    private SLNode next;

    //SLL Node Class

    public SLNode(Object element, SLNode next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return element.toString();
    }
}
