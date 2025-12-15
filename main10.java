public class main10 {
    public static void main(String[]args){
        int n=345;
        int lastDigit=n%10;
        if(lastDigit % 3==0)
            System.out.println("Last Digit Divisible by 3");
        else
            System.out.println("Last Digit is not Divisible by 3");
    }
}
