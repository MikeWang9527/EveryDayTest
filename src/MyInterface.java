/**
 * @author MikeWang
 * @date 2023/12/27 14:19
 */
public interface MyInterface {
    void method1();

    default void method2() {
        System.out.println("This is a default method.");
    }
}
