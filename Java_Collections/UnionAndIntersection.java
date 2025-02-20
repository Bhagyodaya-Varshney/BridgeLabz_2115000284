import java.util.*;

public class UnionAndIntersection{
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>(set1);
        for (int num : set2) 
			res.add(num);
        return res;
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();
        for (int num : set1)
            if (set2.contains(num)) res.add(num);
        return res;
    }
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5));
		
        Set<Integer> union=new HashSet<>(set1);
        Set<Integer> intersection=new HashSet<>(set1);
		
        
        System.out.println("Union : "+union(set1,set2));
        System.out.println("Intersection : "+intersection(set1,set2));
    }
}
