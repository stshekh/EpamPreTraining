package epam.shekh.task4;

import epam.shekh.task4.ex1.HeadOrTails;
import epam.shekh.task4.ex2.NaturalNumbers;

public class Test {
    public static void main(String[] args) {
        HeadOrTails heads = new HeadOrTails();
        heads.coinThrower(1000);

        NaturalNumbers num=new NaturalNumbers(990);
        System.out.println("Max number in "+num.getNum()+" is "+num.maxNum());

        System.out.println("Is "+num.getNum()+" polyndrome? "+ num.polyCheck());
        System.out.println("Is "+num.getNum()+" simple? "+ num.isSimple(num.getNum()));
        System.out.println(num.primeNumbers());
    }
}
