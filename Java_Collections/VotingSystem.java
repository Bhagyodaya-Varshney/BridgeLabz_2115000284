import java.util.*;

public class VotingSystem {
    private static Map<String,Integer> votesMap=new HashMap<>();
    private static Map<String,Integer> orderedVotesMap=new LinkedHashMap<>();
    private static Map<String,Integer> sortedVotesMap=new TreeMap<>((a,b)->votesMap.get(b)-votesMap.get(a));

    public static void addVote(String cand) {
        votesMap.put(cand,votesMap.getOrDefault(cand,0)+1);
        orderedVotesMap.put(cand,votesMap.get(cand));
        sortedVotesMap.put(cand,votesMap.get(cand));
    }

    public static void displayHashMap() {
        System.out.println("HashMap:");
        votesMap.forEach((cand ,votes)->System.out.println(cand +":"+votes));
    }

    public static void displayLinkedHashMap() {
        System.out.println("LinkedHashMap:");
        orderedVotesMap.forEach((cand ,votes)->System.out.println(cand +":"+votes));
    }

    public static void displayTreeMap() {
        System.out.println("TreeMap:");
        sortedVotesMap.forEach((cand, votes) -> System.out.println(cand + ":" + votes));
    }

    public static void main(String[] args) {
        addVote("Kunal");
        addVote("Anuj");
        addVote("Bhagyodaya");
		addVote("Kunal");

        displayHashMap();
        displayLinkedHashMap();
        displayTreeMap();
    }
}
