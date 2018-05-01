package epam.shekh.Task3.ex1;

public class Triangles {
    private Point a, b, c;
    private double lAB, lAC, lCB;

    public Triangles(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        lAB = triangleSide(a, b);
        lAC = triangleSide(a, c);
        lCB = triangleSide(c, b);
    }

    private double triangleSide(Point a, Point b) {
        //line is sqr from (xa-xb)^2+(ya-yb)^2
        System.out.println("Length "+Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)));

        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public void itTraingle() {
        boolean isOk = true;
        if (lAB + lAC <= lCB) {
            isOk = false;
        } else if (lAB + lCB <= lAC) {
            isOk = false;
        } else if (lCB + lAC <= lAB) {
            isOk = false;
        }
        if (isOk) {
            System.out.println("Points construct a triangle");
            double sqAB=lAB*lAB;
            double sqAC=lAC*lAC;
            double sqCB=lCB*lCB;

            if(angleTrian(sqAB,sqAC,sqCB) || angleTrian(sqAB,sqCB,sqAC) || angleTrian(sqAC,sqCB,sqAB))
            {
                System.out.println("It's an square triangle");
            }
        }
        else{
            System.out.println("It's not a triangle!");
        }

    }

    boolean angleTrian(double a, double b, double c){
        return a + b == c;
    }

}
