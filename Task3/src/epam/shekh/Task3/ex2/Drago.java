package epam.shekh.Task3.ex2;

public class Drago {
    private static final int YOUNGPREIOD = 200;
    private static final int ADULTPREIOD = 200;

    private static final int HEADSYOUNGPREIOD = 3;
    private static final int HEADSADULTPREIOD = 2;

    private int age;

    public Drago(int age) {
        this.age = age;
    }

    int dragoHeads() {
        int head = 0;
        if (age > 0) {
            if (age <= YOUNGPREIOD) {
                head += age * HEADSYOUNGPREIOD + 3;
            } else if (age <= ADULTPREIOD) {
                head += 203 + age * HEADSADULTPREIOD;
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
