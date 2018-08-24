public class ArvutamiseKontroll {
    double korrutis (double a, double b){
        double c= (a*b);
        return c;
    };
    double liitmine(double a, double b){
        double c= a+b;
        return c;
    }
    double jagatis(double a, double b){
        double c=korrutis(a, b)/liitmine(a, b);
        return  c;
    }
    void myMeth() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println("Number on: " + i);
        }
    }

}
