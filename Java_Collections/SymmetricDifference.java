import java.util.*;

public class SymmetricDifference{
	public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();
        
        for (int num : set1)
            if (!set2.contains(num)) res.add(num);
        for (int num : set2)
            if (!set1.contains(num)) res.add(num);

        return res;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(symmetricDifference(set1, set2));
    }
}
