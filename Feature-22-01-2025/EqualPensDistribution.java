public class EqualPensDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int pensLeft = pens % students;
        System.out.println(
                "The Pens per Student is:" + pensPerStudent + "and the remaining pens not distributed is:" + pensLeft);
    }
}
