package epam.shekh.Task3.ex2;

public class Drago {
    private int year;

    public Drago(int year) {
        this.year = year;
    }

    int dragoHeads() {
        int head = 3;
        if (year <= 200) {
            head = head + year * 3;
        } else if (year > 200 && year <= 300) {
            head = head + 200 * 3 + (year - 200) * 2;
        } else {
            head = head + 200 * 3 + 100 * 2 + (year - 300);
        }
        return head;
    }

    public void headsAndEyes() {
        System.out.println("Total heads: " + dragoHeads());
        System.out.println("Total eyes: " + dragoHeads() * 2);
    }
}
