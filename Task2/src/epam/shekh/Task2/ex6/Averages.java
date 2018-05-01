package epam.shekh.Task2.ex6;

public class Averages {
    public static void averageArifm(int num){
        int counter=0;
        double sum=0;
        while(num>0) {
            int curNum=num%10;
            sum+=curNum;
            num/=10;
            counter++;
        }
        System.out.println("Average arifm is "+sum/counter);
    }

    public static void averageGeometr(int num){
        int counter=0;
        int mul=1;
        while(num>0) {
            int curNum=num%10;
            mul*=curNum;
            num/=10;
            counter++;
        }
        System.out.println("Average geom is "+Math.pow(mul,1.0/counter));
    }
}
