package epam.shekh.task4.ex1;

public class HeadOrTails {
    private int head, tails;
    public void coinThrower(int attempts) {
        int a;
        for (int i = 0; i < attempts; i++) {
            a = (int) (Math.random() * 2);
            if (a == 0) {
                head++;
            } else {
                tails++;
            }
        }
        System.out.println("Head was: "+head);
        System.out.println("Tails was: "+tails);
    }
}
