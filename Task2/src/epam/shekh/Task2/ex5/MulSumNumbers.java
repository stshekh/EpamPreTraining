package epam.shekh.Task2.ex5;

public class MulSumNumbers {
    public static void sumNum(int num){
        int sum=0;
        while(num>0) {
            int curNum=num%10;
            sum+=curNum;
            num/=10;
        }
        System.out.println("Sum is "+sum);
    }

    public static void mulNum(int num){
        int mul=1;
        while(num>0) {
            int curNum=num%10;
            mul*=curNum;
            num/=10;
        }
        System.out.println("Multiple is "+mul);
    }
}
