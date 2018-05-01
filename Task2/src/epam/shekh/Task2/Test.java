package epam.shekh.Task2;

import epam.shekh.Task2.ex1.MassConverter;
import epam.shekh.Task2.ex2.RingSquare;
import epam.shekh.Task2.ex3.Changer;
import epam.shekh.Task2.ex4.Sequences;
import epam.shekh.Task2.ex5.MulSumNumbers;
import epam.shekh.Task2.ex6.Averages;
import epam.shekh.Task2.ex7.ReversingNumber;

public class Test {
    public static void main(String[] args) {
        //Excercise 1
        System.out.println("****************----Dinasours mass converter----*****************");
        MassConverter.massConvert(14);

        //Excercise 2
        System.out.println("\n****************----Ring area----*****************");
        RingSquare.ring(14,10);

        //Excercise 3
        System.out.println("\n****************----Number change----*****************");
        Changer.exchange(14,9);

        //Excercise 4
        System.out.println("\n****************----Sequences----*****************");
        Sequences.decreasingSequence(9870);
        Sequences.increasingSequence(1237);

        //Excercise 5
        System.out.println("\n****************----Multiple and sum----*****************");
        MulSumNumbers.sumNum(13145);
        MulSumNumbers.mulNum(12335);

        //Excercise 6
        System.out.println("\n****************----Averages----*****************");
        Averages.averageArifm(123456);
        Averages.averageGeometr(123456);

        //Excercise 7
        System.out.println("\n****************----Reverse----*****************");
        ReversingNumber.revNumber(1234567);
    }
}
