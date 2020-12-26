package Generic;

/**
 * @author MikeWang
 * @date 2020/11/24 1:33 下午
 */
public class MyListImpl<E> implements MyList<E> {
    @Override
    public void showTypeName(E e) {
    System.out.println(e.getClass().getTypeName());
    }
}
