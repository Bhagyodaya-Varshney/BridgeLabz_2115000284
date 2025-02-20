import java.util.*;

public class WordFrequency{
    public static void main(String[] args) {
        String st = "Hello world";
        System.out.println(countWords(st));
    }

    public static Map<String,Integer> countWords(String st) {
        Map<String,Integer> map=new HashMap<>();
        st = st.toLowerCase().replaceAll("[^a-z ]","");
        String[] words = st.split("\\s+");
        for(String w:words){
            if(map.containsKey(w))
                map.put(w,map.get(w)+1);
            else
                map.put(w,1);
        }
        return map;
    }
}
