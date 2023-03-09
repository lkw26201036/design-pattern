package flyweight;

public class Client {
    public static void main(String[] args) {
        // 创建两棵树用于共享
        TreeNode tree1 = new TreeNode(0, 1, TreeFactory.getTree("迎客松"));
        TreeNode tree2 = new TreeNode(2, 4, TreeFactory.getTree("迎客松"));
        System.out.println(tree1 == tree2);

        // 再次创建两棵不同的树
        TreeNode treeNode3 = new TreeNode(0, 0, TreeFactory.getTree("龙血树"));
        TreeNode treeNode4 = new TreeNode(2, 3, TreeFactory.getTree("龙血树"));

        // 最后结果发现，当树的名称是一样的时候，共享的是同一个变量name
        // 一般对于不可变的对象，就使用享元模式创建对象


    }
}
