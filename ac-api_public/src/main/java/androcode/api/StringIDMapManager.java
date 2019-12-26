package androcode.api;

import java.util.Map;

public interface StringIDMapManager<T> {
    public T put(String id,T t);
    public T remove(String id);
    public void remove(T t);
    public static class DefaultImpl {

        public static Object add(Map map, String id, Object o) {
//            map.put(id,o)
            return null;
        }

        public static Object remove(Map map,String id) {
            return null;
        }

        public static void remove(Map map,Object o) {

        }
    }
}
