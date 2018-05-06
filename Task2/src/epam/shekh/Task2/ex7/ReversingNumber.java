package epam.shekh.Task2.ex7;

public class ReversingNumber {
    private static final int ONEDIGIT = 10;
    public static int revNumber(int num){
        int newNum=0;
        newNum+=(num%ONEDIGIT)*1000000;
        num/=ONEDIGIT;
        newNum+=(num%ONEDIGIT)*100000;
        num/=ONEDIGIT;
        newNum+=(num%ONEDIGIT)*10000;
        num/=ONEDIGIT;
        newNum+=(num%ONEDIGIT)*1000;
        num/=ONEDIGIT;
        newNum+=(num%ONEDIGIT)*100;
        num/=ONEDIGIT;
        newNum+=(num%ONEDIGIT)*10+(num/ONEDIGIT);

        return newNum;
    }
}
