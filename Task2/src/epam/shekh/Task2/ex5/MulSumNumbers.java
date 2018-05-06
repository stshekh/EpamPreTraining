package epam.shekh.Task2.ex5;

public class MulSumNumbers {
    private static final int ONEDIGIT = 10;
    public static int sumNum(int num){
        int sum=0;
        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum=sum+num%ONEDIGIT+num/ONEDIGIT;
        return sum;
    }

    public static int mulNum(int num){
        int mul=1;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul=mul*(num%ONEDIGIT)*(num/ONEDIGIT);
        return mul;

    }
}
