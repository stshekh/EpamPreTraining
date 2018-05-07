package epam.shekh.task4.ex2;

public class NaturalNumbers {
    private int num;
    private static final int ONEDIGIT = 10;

    public NaturalNumbers(int num) {
        this.num = num;
    }

    private boolean posCheck() {
        return getNum() > 0;
    }

    public int getNum() {
        return num;
    }

    public int maxNum() {
        int natNumber = getNum();
        int max = -1;
        if (!posCheck()) {
            return 0;
        }
        while (natNumber > 0) {
            if (natNumber % ONEDIGIT > max) {
                max = natNumber % ONEDIGIT;
            }
            natNumber /= ONEDIGIT;
        }
        return max;
    }

    public boolean polyCheck() {
        if (!posCheck()) return false;
        boolean isOk;
        int nat = getNum();
        int newNat = 0;

        while (nat > 0) {
            newNat = newNat * ONEDIGIT + (nat % ONEDIGIT);
            nat /= ONEDIGIT;
        }
        if (getNum() != newNat) {
            isOk = false;
        } else {
            isOk = true;
        }
        return isOk;
    }


    public boolean isSimple(int nat) {


        if (!posCheck()) return false;
        for (int i = 2; i < nat + 1; i++) {
            if (nat % i == 0 && i != nat) {
                return false;
            }
        }
        return true;
    }

    public String primeNumbers() {
        int i;
        int nat = getNum();
        String s = "Prime numbers of "+nat+":";
        for (i = 2; i <= nat; i++) {
            if (isSimple(i) && nat % i == 0) {
                s += " " + i;
                nat /= i;
                i--;
            }
        }
        return s;
    }
}
