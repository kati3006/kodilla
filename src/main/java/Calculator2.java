class Sum {
    private double A;
    private double B;
    public Sum(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public Double calculateSum() {
        return this.A + this.B;
    }
}

class Difference {
    private double C;
    private double D;
    public Difference(double C, double D) {
        this.C = C;
        this.D = D;
    }

    public Double calculateDifference() {
        return this.C - this.D;
    }
}

public class Calculator2 {
    public static void main(String args[]) {
        Sum calculateSum = new Sum(1.0, 2.0 );
        System.out.println(calculateSum);

        Difference  calculateDifference= new Difference(5.0, 6.0);
        System.out.println(calculateDifference);
    }
}
