import java.util.*;

class PairSum{
    public static boolean pairSumFunc(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : arr) {
            int num = targetSum - i;
            if (set.contains(num)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15,2};
        int target = 9;
        
        System.out.println(pairSumFunc(arr, target));
    }
}
