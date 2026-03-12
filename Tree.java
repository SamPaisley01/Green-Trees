package greentrees;

public class Tree implements Comparable<Tree> {

    private final int treeId;
    private String name;
    private String type;
    private double price;

    public Tree(int treeId, String name, String type, double price) {
        this.treeId = treeId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Tree o) {
        return 0;
    }
    
}
