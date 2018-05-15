package epam.shekh.task4.ex2;

public class NaturalNumbers {
    private int num;
    private static final int ONEDIGIT = 10;

    public NaturalNumbers(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            this.num = -num;
        }
    }

    public int getNum() {
        return num;
    }

    public int maxNum() {
        int natNumber = getNum();
        int max = -1;
//        if (!posCheck()) {
//            return 0;
//        }
        while (natNumber > 0) {
            if (natNumber % ONEDIGIT > max) {
                max = natNumber % ONEDIGIT;
            }
            natNumber /= ONEDIGIT;
        }
        return max;
    }

    public boolean polyCheck() {
        //if (!posCheck()) return false;
        boolean isOk;
        int nat = getNum();
        int newNat = 0;

        while (nat > 0) {
            newNat = newNat * ONEDIGIT + (nat % ONEDIGIT);
            nat /= ONEDIGIT;
        }
        isOk = getNum() == newNat;
        return isOk;
    }


    public boolean isSimple(int nat) {


        //if (!posCheck()) return false;
        for (int i = 2; i <= (nat/2)+1; i++) {
            if (nat % i == 0 && i != nat) {
                return false;
            }
        }
        return true;
    }

    public String primeNumbers() {
        int i;
        int nat = getNum();
        String s = "Prime numbers of " + nat + ":";
        for (i = 2; i <= nat; i++) {
            if (isSimple(i) && nat % i == 0) {
                s += " " + i;
                nat /= i;
                i--;
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
        int nat = getNum();
        int newNat, numCount = 0;
        int curNum;
        for (int i = 0; i < 10; i++) {
            newNat = nat;
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
        int nat = getNum();
        int perfSum = 0;

        for (int i = 1; i < nat; i++) {
            if (nat % i == 0) {
                perfSum += i;
            }
        }
        return (nat == perfSum);
    }
}
