package greentrees;
public class TreePlantRequest {

    private Volunteer volunteer;
    private Tree tree;

    public TreePlantRequest(Volunteer volunteer, Tree tree) {
        this.volunteer = volunteer;
        this.tree = tree;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public Tree getTree() {
        return tree;
    }
}