import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @PACKAGE_NAME: PACKAGE_NAME
 * @NAME: assertTest
 * @USER: wds
 * @DATE: 2020/10/16 16:32
 */
public class assertTest {
/**
 * @description：TODO
 * @author     ：wds
 * @date       ：2020/10/16 16:32
 */

        public static void main(String[] args) {
            testMap();
            BigDecimal bigDecimal = new BigDecimal("0");
            System.out.println(bigDecimal);
        }

        public static   void  a (String name){
            System.out.println(Arrays.toString(name.getBytes()));
            System.out.println(name);
        }


        public static void  testMap(){
            HashMap<String, Object> map1 = new HashMap<>();
            HashMap<String, Object> map2 = new HashMap<>();
            HashMap<String, Object> map3 = new HashMap<>();
            ArrayList<HashMap<String,Object>> list = new ArrayList<>();
            map1.put("num",BigDecimal.valueOf(1));
            map2.put("num",BigDecimal.valueOf(1));
            map3.put("num",BigDecimal.valueOf(1));
            list.add(map1);
            list.add(map2);
            list.add(map3);

            List<Collection<Object>> collect = list.stream().map(Map::values).collect(Collectors.toList());
            for (Collection<Object> objects : collect) {
                System.out.println("1  "+objects.toString());
            }


            BigDecimal num = list.stream().map(s -> new BigDecimal(s.get("num").toString())).reduce(BigDecimal.ZERO, BigDecimal::add);
            System.out.println("2:"+ num);


//            IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(value -> value));

            String a="";
            String b=null;
            System.out.println(isNullOrEmpty(a));
            System.out.println(isNullOrEmpty(b));

        }

    public static boolean isNullOrEmpty(Object o) {
        return ((o == null) || (String.valueOf(o).trim().length() == 0) || "null".equals(o));
    }

}
