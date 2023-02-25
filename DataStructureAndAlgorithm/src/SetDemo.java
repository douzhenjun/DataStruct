import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("窦振军");
        set.add("王浩林");
        System.out.println(set);
//        Object[] obj = set.toArray();
//        System.out.println(obj);
//        for (Object ele:obj) {
//            System.out.println(ele);
//        }

        String[] str = set.toArray(new String[]{});
        for(String ele:str){
            System.out.println(ele);
        }
    }
}
