package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author MikeWang
 * @date 2020/12/11 10:04 上午
 * <p>FlatMap
 *将流中的每一个元素 T 映射为一个流，再把每一个流连接成为一个流
 */
public class FlatMapTest {

    public static void testFlatMap() {
    List<List<String>> list =
        new ArrayList<List<String>>() {
          {
            add(Arrays.asList("a", "b", "c"));
            add(Arrays.asList("d", "e", "f"));
            add(Arrays.asList("j", "k", "y"));
          }
        };
        //结果：[[a, b, c], [d, e, f], [j, k, y]]
        System.out.println(list);
        List<String> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
        //结果：[a, b, c, d, e, f, j, k, y]
        System.out.println(collect);
    }

  public static void main(String[] args) {
    //
      testFlatMap();
  }
}
