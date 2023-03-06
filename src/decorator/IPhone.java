package decorator;

/**
 * 具体构件角色
 */
public class IPhone implements Phone{
    /**
     * 手机可以聊天
     */
    @Override
    public void chat() {
        System.out.println("iphone手机");
    }
}
