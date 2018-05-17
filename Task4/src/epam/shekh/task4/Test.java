package epam.shekh.task4;

import epam.shekh.task4.ex1.HeadOrTails;
import epam.shekh.task4.ex2.NaturalNumbers;

public class Test {
    public static void main(String[] args) {
        System.out.println("Excercise 1---------------");
        HeadOrTails heads = new HeadOrTails();
        int head=heads.coinThrower(1000);
        System.out.println("Heads: "+head);
        System.out.println("Tails: "+(1000-head));

        System.out.println("\nExcercise 2---------------");
        NaturalNumbers num=new NaturalNumbers(496);
        System.out.println("Max number in "+num.getNum()+" is "+num.maxNum());

        System.out.println("Is "+num.getNum()+" polyndrome? "+ num.polyCheck());
        System.out.println("Is "+num.getNum()+" simple? "+ num.isSimple(num.getNum()));
        System.out.println(num.primeDividers());
        System.out.println("Greatest common divisor: "+NaturalNumbers.maxCommonDiv(7920,594));
        System.out.println("Least common multiple "+NaturalNumbers.leastCommonMultiple(72,54));
        System.out.println("How many different figures are there in "+num.getNum()+"? "+num.difNumbers());
        System.out.println("\nExcercise 3---------------");
        System.out.println("Is "+num.getNum()+" a perfect number? "+num.perfectNumber());
    }
}
