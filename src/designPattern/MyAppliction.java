package designPattern;

/**
 * 静态方法启动时已经加载完成，在本例中可以直接通过对象引用或类名（不需要实例化）访问静态成员
 *
 */
public class MyAppliction {
    public static void main(String[] args) {
        StaticTest test =null;
        test.hello();
    }
}
