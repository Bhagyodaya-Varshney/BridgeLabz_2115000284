import java.util.*;
public class BankingSystem {

    private static HashMap<Integer,Integer> accMap = new HashMap<>();
    private static TreeMap<Integer,Integer> sortedAccountMap = new TreeMap<>(Comparator.comparing(accMap::get));
    private static Queue<Integer> withdrawalQueue = new LinkedList<>();

    public static void addAccount(int accNo,int balance) {
        accMap.put(accNo,balance);
        sortedAccountMap.put(accNo,balance);
    }

    public static void requestWithdrawal(int accNum) {
        if(accMap.containsKey(accNum)) {
            withdrawalQueue.add(accNum);
        }
    }
    public static void processWithdrawals() {
        while(!withdrawalQueue.isEmpty()) {
            int accNum = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: "+accNum);
        }
    }
    public static void displayAccounts() {
        System.out.println("Accounts:");
        accMap.forEach((accNum,balance)->System.out.println(accNum +":"+balance));
    }
    public static void displaySortedAccounts() {
        System.out.println("Sorted Accounts:");
        sortedAccountMap.forEach((accNum ,balance)->System.out.println(accNum +":"+balance));
    }
    public static void main(String[] args) {
        addAccount(20012,10000);
        addAccount(20013,1000);
        addAccount(20014,12000);
        addAccount(20015,5400);
        addAccount(20016,45000);

        requestWithdrawal(20014);
        requestWithdrawal(20015);
        requestWithdrawal(20012);

        displayAccounts();
        displaySortedAccounts();
        processWithdrawals();
    }
}
