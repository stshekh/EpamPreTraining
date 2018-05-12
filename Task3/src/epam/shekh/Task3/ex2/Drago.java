package epam.shekh.Task3.ex2;

public class Drago {
    private static final int YOUNGPREIOD = 200;
    private static final int ADULTPREIOD = 300;
    private static final int STARTHEADS = 3;

    private static final int HEADSYOUNGPREIOD = 3;
    private static final int HEADSADULTPREIOD = 2;

    private int age;

    public Drago(int age) {
        this.age = age;
    }

    public int dragoHeads() {
        int head = 0;
        if (age > 0) {
            if (age <= YOUNGPREIOD) {
                head += age * HEADSYOUNGPREIOD + STARTHEADS;
            } else if (age <= ADULTPREIOD) {
                head += YOUNGPREIOD * HEADSYOUNGPREIOD + (age - YOUNGPREIOD) * HEADSADULTPREIOD + STARTHEADS;
            } else {
                head += STARTHEADS + YOUNGPREIOD * HEADSYOUNGPREIOD + (ADULTPREIOD - YOUNGPREIOD) * HEADSADULTPREIOD + (age - ADULTPREIOD);
            }
        }
        return head;
    }

}
