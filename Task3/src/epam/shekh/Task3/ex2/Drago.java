package epam.shekh.Task3.ex2;

public class Drago {
    private static final int YOUNGPREIOD = 200;
    private static final int ADULTPREIOD = 200;

    private static final int HEADSYOUNGPREIOD = 200;
    private static final int HEADSADULTPREIOD = 200;

    private int age;

    public Drago(int age) {
        this.age = age;
    }

    int dragoHeads() {
        int head = 0;
        if (age > 0) {
            if (age < 200) {
                head += age * 3 + 3;
            } else if (age < 300) {
                head += 203 + age * 2;
            } else {
                head += 503 + age;
            }
        }
        return head;
    }

    public void headsAndEyes() {
        System.out.println("Total heads: " + dragoHeads());
        System.out.println("Total eyes: " + dragoHeads() * 2);
    }
}
