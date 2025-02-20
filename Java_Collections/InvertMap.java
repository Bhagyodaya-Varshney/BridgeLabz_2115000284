import java.util.*;

public class InvertMap{
	public static Map<Integer,List<String>> invertMapFunc(Map<String,Integer> map) {
        HashMap<Integer,List<String>> invertedhm = new HashMap<>();
		
        for(Map.Entry<String,Integer> e:map.entrySet()){
            int key=e.getValue();
            String value=e.getKey();
            if(!invertedhm.containsKey(key)){
                invertedhm.put(key,new ArrayList<>());
            }
            invertedhm.get(key).add(value);
        }
        return invertedhm;
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C",1);
        System.out.println(invertMapFunc(hm));
    }
}
