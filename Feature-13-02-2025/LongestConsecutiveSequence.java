import java.util.*;

class LongestConsecutiveSequence {
    public static int findLongestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1, current = num;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2, 5, 7, 6, 8};
        System.out.println(findLongestSequence(arr));
    }
}
