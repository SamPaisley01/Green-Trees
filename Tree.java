package greentrees;

public class Tree {

    private int treeId;
    private String name;
    private double price;

    public Tree(int treeId, String name, double price) {
        this.treeId = treeId;
        this.name = name;
        this.price = price;
    }
    
    public int getTreeId() {
       return treeId;
    }
    
    public void setTreeID(int treeID) {
        this.treeId = treeID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (€" + price + ")";
    }
}
