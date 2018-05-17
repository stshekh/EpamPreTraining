package epam.shekh.task4.ex2;

public class NaturalNumbers {
    private int num;
    private static final int ONEDIGIT = 10;

    public NaturalNumbers(int num) {
        this.num = (num > 0) ? num : -num;
    }

    public int getNum() {
        return num;
    }

    public int maxNum() {
        int natNumber = getNum();
        int max = -1;
        while (natNumber > 0) {
            if (natNumber % ONEDIGIT > max) {
                max = natNumber % ONEDIGIT;
            }
            natNumber /= ONEDIGIT;
        }
        return max;
    }

    public boolean polyCheck() {
        int nat = getNum();
        int newNat = 0;

        while (nat > 0) {
            newNat = newNat * ONEDIGIT + (nat % ONEDIGIT);
            nat /= ONEDIGIT;
        }
        return getNum() == newNat;
    }


    public boolean isSimple(int nat) {
        int number = (nat / 2) + 1;
        for (int i = 2; i <= number; i++) {
            if (nat % i == 0 && i != nat) {
                return false;
            }
        }
        return true;
    }

    public String primeDividers() {
        int i;
        int natNumber = getNum();
        int halfNatNumber = (natNumber / 2) + 1;
        String s = "Prime numbers of " + natNumber + ":";
        for (i = 2; i <= halfNatNumber; i++) {
            if (isSimple(i) && natNumber % i == 0) {
                s += " " + i;
            }
        }
        return s;
    }

    public static int maxCommonDiv(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return maxCommonDiv(b, a % b);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return (a * b) / maxCommonDiv(a, b);
    }

    public int difNumbers() {
        int natNumber = getNum();
        int newNat, numCount = 0;
        int curNum;
        for (int i = 0; i < 10; i++) {
            newNat = natNumber;
            while (newNat > 0) {
                curNum = newNat % ONEDIGIT;
                if (curNum == i) {
                    numCount++;
                    break;
                }
                newNat /= ONEDIGIT;
            }

        }
        if (numCount == 1) {
            System.out.println("This numbrer has many equal figures");
        }
        return numCount;
    }

    public boolean perfectNumber() {
        int natNumber = getNum();
        int perfSum = 0;
        for (int i = 1; i < natNumber; i++) {
            if (natNumber % i == 0) {
                perfSum += i;
            }
        }
        return (natNumber == perfSum);
    }
}
