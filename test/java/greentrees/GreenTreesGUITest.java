package greentrees;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

//Unit test cases for GreenTreesGUI class

public class GreenTreesGUITest {

    @Test
    public void testVolunteerTreePlanting() {
        GreenTreesApp.treeQueue = new TreeQueue();
        Volunteer v = new Volunteer("John", 1, "123", "Dublin", "085");
        Tree tree = new Tree(1,"Oak",10);
        TreePlantRequest request = new TreePlantRequest(v, tree);
        GreenTreesApp.treeQueue.enqueue(request);
        TreePlantRequest dequeued = (TreePlantRequest) GreenTreesApp.treeQueue.dequeue();
        Volunteer result = dequeued.getVolunteer();
        result.setTotalTreesPlanted(result.getTotalTreesPlanted() + 1);
        assertEquals(1, result.getTotalTreesPlanted());
    }


    @Test
    public void testQueueEnqueue() {
        GreenTreesApp.treeQueue = new TreeQueue();
        Volunteer v = new Volunteer("Mary", 2, "pass", "Cork", "086");
        Tree tree = new Tree(2,"Birch",15);
        TreePlantRequest request = new TreePlantRequest(v, tree);
        GreenTreesApp.treeQueue.enqueue(request);
        assertEquals(1, GreenTreesApp.treeQueue.size());
    }

    @Test
    public void testQueueDequeue() {
        GreenTreesApp.treeQueue = new TreeQueue();
        Volunteer v = new Volunteer("Alex", 3, "pw", "Galway", "087");
        Tree tree = new Tree(3,"Cherry Blossom",25);
        TreePlantRequest request = new TreePlantRequest(v, tree);
        GreenTreesApp.treeQueue.enqueue(request);
        TreePlantRequest removed = (TreePlantRequest) GreenTreesApp.treeQueue.dequeue();
        assertNotNull(removed);
        assertEquals("Cherry Blossom", removed.getTree().getName());
    }
}