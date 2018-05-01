package epam.shekh.Task2.ex7;

public class ReversingNumber {
    public static void revNumber(int num){
        int res=0;
        while(num>0){
            res=res*10+num%10;
            num/=10;
        }
        System.out.println("Result: " + res);
    }
}
