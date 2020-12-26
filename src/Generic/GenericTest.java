package Generic;

import java.util.HashMap;

/**
 * @author MikeWang
 * @date 2020/11/24 1:34 下午
 */
public class GenericTest {
  public static void main(String[] args) {
    //
      MyList<String> stringMyList = new MyListImpl<>();
      stringMyList.showTypeName("hello");
  }
}
