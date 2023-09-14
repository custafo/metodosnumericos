package BissecComplete;
public class Main {

    // 1) x^2 + ln(x) = 0 | e ≤ 10–2 entrada [0.5, 1]
    // 2) x^5 + 2x + 2x + 1 = 0 | e ≤ 10–2 entrada [-1. 0]
    // 3) sen (x) – ln (x) = 0 | e ≤ 10^5 entrada [2, 25]

    public static void main(String[] args) {
        Bissec test = new Bissec();

        System.out.println("First question:");
        System.out.println(test.firstfunc(0.5, 1, 0.01));

        System.out.println("Second question");
        System.out.println(test.secfunc(-1, 0, 0.01));

        System.out.println("Third question");
        System.out.println(test.thirdfunc(2, 25, 0.00001));
    }
}
