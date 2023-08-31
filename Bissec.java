public class Bissec {
   
    public Bissec() {
    }

    // ____________________________________________________________
    public String firstfunc(double a, double b, double errorC) {
        double c = (a + b) / 2;
        double error = Math.abs(c - a);
        if (error >= errorC) {
            System.out.println(c);
        } else {
            return "XDEAD ENDX";
        }
        if (function1(c) * function1(a) < 0) {
            return firstfunc(c, b, errorC);
        } else if (function1(c) * function1(b) < 0) {
            return firstfunc(c, b, errorC);
        }
        return "";
    }

    private double function1(double x) {
        return Math.pow(x, 2) + Math.log(x);
    }

    // _______________________________________________________________

    public String secfunc(double a, double b, double errorC){
        double c = (a + b) / 2;
        double error = Math.abs(c - a);

        if(error >= errorC){
            System.out.println(c);
        }
        else {
            return "XDEAD ENDX";
        }
        if (function2(c) * function2(a) < 0) {
            return secfunc(c, b, errorC);
        }
        else if(function2(c) * function2(b) < 0){
            return secfunc(c, b, errorC);
        }
        return "";
    }

    private double function2(double x) {
        return Math.pow(x, 5) + (2 * Math.pow(x, 3)) + (2 * x) + 1;
    }

    // ________________________________________________________________

    public String thirdfunc(double a, double b, double errorC){
        double c = (a + b) / 2;
        double error = Math.abs(c - a);

        if(error >= errorC){
            System.out.printf("%.5f%n", c);
        }
        else{
            return "XDEAD ENDX";
        }

        if(function3(c) * function3(a) < 0){
            return thirdfunc(a, b, errorC);
        }
        else if(function3(c) * function3(b) < 0){
            return thirdfunc(a, b, errorC);
        }

        return "";
    }

    private double function3(double x){
        return Math.sin(x) - Math.log(x);
    }
}
