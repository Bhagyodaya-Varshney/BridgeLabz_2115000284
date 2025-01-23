import java.util.*;
class ArmstrongNUmber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int dig = temp % 10;
            dig = dig * dig * dig;
            sum+=dig;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Given number is ArmStrong");
        }else{
            System.out.println("Given number is not Armstrong");
        }
    }
}