import java.util.*;

public class FindSubset{
	public static boolean isSubset(Set<Integer> subset, Set<Integer> set) {
        for (int num : subset)
            if (!set.contains(num)) return false;
        return true;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(isSubset(set1, set2));
    }
}
