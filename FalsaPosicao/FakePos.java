package FalsaPosicao;
import java.util.Scanner;

public class FakePos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int iteracao = 0;

        double a, b, tol, m = 0, ma, fafb, e;

        System.out.println("Insira o valor de A: ");
        a = in.nextDouble();

        System.out.println("Insira o valor de B: ");
        b = in.nextDouble();

        System.out.println("Insira a tolerância: ");
        tol = in.nextDouble();

        if (((a * a * a) - 3 * (a) + 1) * ((b * b * b) - 3 * (a) + 1) > 0)

            System.out.print("Não há raiz");

        else {
            System.out.println("Calcule a raiz");

            do {
                iteracao++;

                ma = m;
                System.out.println("ma: " + ma);

                m = (a - (((a * a * a) - 3 * (a) + 1) * (b - a))
                        / (((b * b * b) - 3 * (a) + 1) - ((a * a * a) - 3 * (a) + 1)));

                System.out.println("m: " + m);

                e = (m - ma) / m;

                if (e < 0)

                    e = -e;
                System.out.println("e: " + e);

                fafb = (((a * a * a) - 3 * (a) + 1) * ((m * m * m) - 3 * (a) + 1));
                System.out.println("fafb: " + fafb);

                if (fafb < 0)

                    b = m;
                else if (fafb > 0)
                    a = m;

                System.out.print("iteracao             raiz             e" + "");
                System.out.print(+iteracao);
                System.out.print("                      " + m);
                System.out.print("                       " + e);

            } while (e > tol);
        }

    }

}
