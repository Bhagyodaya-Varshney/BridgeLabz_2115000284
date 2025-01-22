import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to perform Double Operations");
        double da = sc.nextDouble();
        double db = sc.nextDouble();
        double dc = sc.nextDouble();
        System.out.println("The results of Double Operations are " + (da + db * dc) + ", " + (da * db + dc) + ", "
                + (dc + da / db));

    }
}
