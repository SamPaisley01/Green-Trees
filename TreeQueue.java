package greentrees;
import java.util.ArrayList;
public class TreeQueue {
    
    //Using ArrayList for queue
    private ArrayList<TreePlantRequest> theQueue;

    public TreeQueue() {
        theQueue = new ArrayList<>();
    }

    //Queue operations

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public int size() {
        return theQueue.size();
    }

    public TreePlantRequest frontElement() {
        if(!theQueue.isEmpty()){
            return theQueue.get(0);
        }
        return null;
    }

    public void enqueue(TreePlantRequest newItem) {
        theQueue.add(newItem);
    }

    public TreePlantRequest dequeue() {
        if(!theQueue.isEmpty()){
            return theQueue.remove(0);
        }
        return null;
    }
    
    public int getVolunteerPosition(Volunteer v) {
        for(int i = 0; i < theQueue.size(); i++) {
            TreePlantRequest req = theQueue.get(i);
            if(req.getVolunteer().equals(v)) {
                return i + 1;
            }
        }
        return -1;
    }
}
