package LeetCode.设计;

import java.util.HashMap;

/**
 * @Author MikeWang
 * @Date 2020/7/24 3:32 下午
 */
public class LeetCodeNo146 {

    class LRUCache {

        private HashMap<Integer,Node> map;

        private DoubleList cache;

        private  int cap;


        public LRUCache(int capacity) {
            this.cap = capacity;
            map = new HashMap<>();
            cache = new DoubleList();
        }

        public int get(int key) {
            if (!map.containsKey(key)){
                return -1;
            }
            int val = map.get(key).val;
            put(key,val);
            return val;
        }

        public void put(int key, int value) {
            Node x = new Node(key, value);
            if (map.containsKey(key)){
                //删除旧的节点,新的插到头部
                cache.remove(map.get(key));
                cache.addFirst(x);
                map.put(key,x);
            }else {
                if (cap==cache.size()){
                    Node last = cache.removeLast();
                    map.remove(last.key);
                }
                //直接插入头部
                cache.addFirst(x);
                map.put(key,x);
            }
        }
    }

}
