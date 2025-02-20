import java.util.*;

public class MergeMaps{
    public static HashMap<String,Integer> merge(HashMap<String,Integer> hm1, HashMap<String,Integer> hm2) {
        HashMap<String,Integer> mergedhm = new HashMap<>(hm1);
		
        for(Map.Entry<String,Integer> e: hm2.entrySet()){
            String key=e.getKey();
            int value=e.getValue();
            if(mergedhm.containsKey(key)){
                mergedhm.put(key,mergedhm.get(key)+value);
            }else{
                mergedhm.put(key,value);
            }
        }
        return mergedhm;
    }
    public static void main(String[] args) {

        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("A",1);
        hm1.put("B",2);
		
        HashMap<String,Integer> hm2 = new HashMap<>();
        hm2.put("B",3);
        hm2.put("C",4);

        System.out.println(merge(hm1,hm2));
    }
}
