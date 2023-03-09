package flyweight;

/**
 * 树对象
 */
public class Tree {

    private final String name;

    public Tree(String name) {
        System.out.println("name => " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
