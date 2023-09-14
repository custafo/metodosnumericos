package IteracaoLinear;

public class LinearIteration {
    public static double IteracaoLinear(double x0, double E, int MaxIteration) {
        for (int i = 0; i < MaxIteration; i++) {
            double x1 = g(x0);

            if (Math.abs(x1 - x0) < E) {
                return x1;
            }

            x0 = x1;
        }

        throw new IllegalStateException("Excedeu o número máximo de iterações");
    }

    public static double g(double x) {
        return Math.sqrt(x + 4);
    }

    public static void main(String[] args) {
        double x0 = 0;
        double E = 0.0001;
        int MaxIteration = 1000;

        double root = IteracaoLinear(x0, E, MaxIteration);
        System.out.println("A raíz, aproximada, é: " + root);
    }
}
