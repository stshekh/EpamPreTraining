package epam.shekh.Task3;


import epam.shekh.Task3.ex1.Point;

import epam.shekh.Task3.ex1.Triangles;
import epam.shekh.Task3.ex2.Drago;
import epam.shekh.Task3.ex3.LetterCheck;
import epam.shekh.Task3.ex4.MoodSensor;
import epam.shekh.Task3.ex5.DateChecker;

public class Test {
    public static void main(String[] args) {
        Point a = new Point(0, 3);
        Point b = new Point(4, 0);
        Point c = new Point(0, 0);
        Triangles tr = new Triangles(a, b, c);
        System.out.println("It's a triangle? "+tr.isTraingle());
        System.out.println("Is it right triangle?"+tr.isRightTriangle());
        System.out.println("-----------");

        Drago oldDrago = new Drago(200);
        System.out.println("Heads "+oldDrago.dragoHeads());
        System.out.println("Eyes "+oldDrago.dragoHeads()*2);
        System.out.println("-----------");

        System.out.println(LetterCheck.method1('k'));
        System.out.println(LetterCheck.method2('e'));
        System.out.println(LetterCheck.method3('q'));
        System.out.println(LetterCheck.method4('y'));
        System.out.println("-----------");

        System.out.println(MoodSensor.myMood());
        System.out.println("-----------");

        DateChecker date = new DateChecker(29, 2, 2000);
        System.out.println(date.nextDay());
    }
}
