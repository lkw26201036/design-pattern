package flyweight;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeFactory {
    // 保证线程安全
    private static Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree getTree(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        Tree tree = new Tree(name);
        // 将创建好的树对象放入到容器中
        map.put(name,tree);
        return tree;

    }
}
