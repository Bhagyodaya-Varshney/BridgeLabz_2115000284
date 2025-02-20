import java.util.*;

public class ReverseList{
    public static void main(String[] args) {
        List<Integer> al =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> ll =new LinkedList<>(al);
        reverseList(al);
        reverseList(ll);
        System.out.println(al);
        System.out.println(ll);

    }
    public static void reverseList(List<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}