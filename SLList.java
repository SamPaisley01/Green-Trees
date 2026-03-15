package greentrees;
public class SLList {
    private SLNode head;
    private int size;
    
    //SLL Class
    
    public SLList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
        
    public void add(Object element) {
        SLNode newNode = new SLNode(element, null);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }   

    //Method to sort volunteers by trees planted in descending order
    public void sortByTreesPlanted() {
        if(head == null) return;
        boolean swapped;
        do {
            swapped = false;
            SLNode current = head;
            while(current.getNext() != null) {
                Volunteer v1 = (Volunteer) current.getElement();
                Volunteer v2 = (Volunteer) current.getNext().getElement();
                if(v1.getTotalTreesPlanted() < v2.getTotalTreesPlanted()) {
                    current.setElement(v2);
                    current.getNext().setElement(v1);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while(swapped);
    }
    
    public String getLeaderboardText() {
        String result = "";
        SLNode current = head;
        while(current != null){
            Volunteer v = (Volunteer) current.getElement();
            result += v.getName() + "-" + v.getTotalTreesPlanted() + " trees\n";
            current = current.getNext();
        }
        return result;
    }
}