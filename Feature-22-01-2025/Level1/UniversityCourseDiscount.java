public class UniversityCourseDiscount {
    public static void main(String[] args) {
        int coursePrice = 125000;
        int discount = 10;
        int discountAmount = (coursePrice * discount) / 100;
        int finalPrice = coursePrice - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
    }
}
