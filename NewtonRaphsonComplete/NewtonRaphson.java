package NewtonRaphsonComplete;
import java.util.Scanner;


public class NewtonRaphson {

    Scanner in = new Scanner(System.in);

    private void regraFalsa(double xI, double error) {
        double xInicial = xI;
        double eMax = error;
        double fxI = f(xInicial);
        double fPrimaX = deriv(xInicial);
        short contador = 1;

        System.out.println("Valores iniciais: Xi = " + xInicial + " Error: " + eMax);

        while (Math.abs(fxI) >= eMax) {
            System.out.println("\n\nIteracion #" + contador);
            System.out.print("\nXi= ");
            System.out.printf("%06f", xInicial);
            System.out.print("\nF(Xi)= ");
            System.out.printf("%06f", fxI);
            System.out.print("\nF'(X)= ");
            System.out.printf("%06f", fPrimaX);

            xInicial = xSiguiente(xInicial, fxI, fPrimaX);
            fxI = f(xInicial);
            fPrimaX = deriv(xInicial);

            contador++;
            System.out.print("\nX+1 = ");
            System.out.printf("%06f", xInicial);
            System.out.print("\nF'(X+1)= ");
            System.out.printf("%06f", fPrimaX);

        }

        System.out.println("\n\nIteracion #" + contador);
        System.out.print("\nXi= ");
        System.out.printf("%06f", xInicial);
        System.out.print("\nF(Xi)= ");
        System.out.printf("%06f", fxI);
        System.out.print("\nF'(X)= ");
        System.out.printf("%06f", fPrimaX);

        System.out.print("\n\nRaiz: ");
        System.out.printf("%06f", xInicial);
        System.out.print("\nF(X" + contador + ")= ");
        System.out.printf("%06f", fxI);
        System.out.println();

    }

    private double f(double x) {
        double fx;
        fx = (double) (((Math.pow((Math.E), (0.5 * x)))) + (5 * x) - 5);
        return fx;
    }

    private double deriv(double x) {
        double dxdy;
        dxdy = (double) ((((Math.pow((Math.E), (0.5 * x)))) / 2) + 5);
        return dxdy;
    }

    private double xSiguiente(double xI, double fx, double fPrimaX) {
        return xI - (fx / fPrimaX);
    }

    public void main() {
        double xI;
        double error;
        System.out.println("Insira o valor inicial:");
        xI = in.nextDouble();
        System.out.println("Insira o erro máximo:");
        error = in.nextDouble();
        regraFalsa(xI, error);
    }
}