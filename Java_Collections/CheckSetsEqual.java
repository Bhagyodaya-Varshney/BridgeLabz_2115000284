import java.util.*;

public class CheckSetsEqual{
    public static boolean areEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() != set2.size()) return false;
        for (int num : set1) {
            if (!set2.contains(num)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(areEqual(set1,set2));
    }
}