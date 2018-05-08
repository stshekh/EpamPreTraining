package epam.shekh.task5;

public class Test {
    public static void main(String[] args) {
        int size=15;
        MyArray array=new MyArray(new double[size],-10,10);
        array.arrayOutput();
        System.out.println(array.minMaxFinder());
        System.out.println(array.averagesFinder());
        System.out.println("Is it sorted? "+array.isSorted());
        System.out.println("Position of local minimum is "+array.localMin());
        System.out.println("Position of local maximum is "+array.localMax());
        array.revMass();
        System.out.println(array.minFinder());
        System.out.println(array.sumParts());
    }
}
