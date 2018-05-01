package epam.shekh.Task3;

import epam.shekh.Task3.*;
import epam.shekh.Task3.ex1.Point;
import epam.shekh.Task3.ex1.Triangles;

public class Test {
    public static void main(String[] args) {
        Point a=new Point(0,3);
        Point b=new Point(4,0);
        Point c =new Point(0,0);

        Triangles tr=new Triangles(a,b,c);

        tr.itTraingle();
    }
}
