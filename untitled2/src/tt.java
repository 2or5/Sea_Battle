import java.util.ArrayList;
import java.util.List;

public class tt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<20; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.get(6));
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list);
    }}
