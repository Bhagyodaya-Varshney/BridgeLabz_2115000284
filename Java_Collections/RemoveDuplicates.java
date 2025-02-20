import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        System.out.println(removeDuplicates(list));
    }
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : list) {
            if (set.add(num)) {
                res.add(num);
            }
        }
        return res;
    }
}
