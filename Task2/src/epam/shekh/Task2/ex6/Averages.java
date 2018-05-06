package epam.shekh.Task2.ex6;

public class Averages {
    private static final int ONEDIGIT = 10;
    public static double averageArifm(int num){

        double sum=0;

        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum+=num%ONEDIGIT;
        num/=ONEDIGIT;
        sum=sum+num%ONEDIGIT;
        num/=ONEDIGIT;
        sum=sum+num%ONEDIGIT+num/ONEDIGIT;
        return sum/6;

    }

    public static double averageGeometr(int num){
        int mul=1;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul*=num%ONEDIGIT;
        num/=ONEDIGIT;
        mul=mul*(num%ONEDIGIT)*(num/ONEDIGIT);
        return Math.pow(mul,1.0/6);

    }
}
