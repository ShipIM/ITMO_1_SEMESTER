package Project;

public class FirstLab {
    public static void main(String[] arg) {
        int counter = 0;

        short[] a = new short[14];
        for (short i = 5; i <= 18; i++, counter++) {
            a[counter] = i;
        }

        double[] x = new double[11];
        for (int i = 0; i < 11; i++) {
            x[i] = Math.random() * (2.0 - (-10.0)) + (-10.0);
        }

        double[][] A = new double[14][11];
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                if (a[i] == 15) {
                    A[i][j] = Math.asin(Math.pow((x[j] - 4) / 12, 2.0)) - (double) 1 / 4;
                }
                if (a[i] == 5 || a[i] >= 7 && a[i] <= 10 || a[i] == 16 || a[i] == 17) {
                    A[i][j] = Math.cos(Math.pow(Math.pow((double) 1 / 2 * (x[j] + 1), x[j]) /
                            ((double) 3 / 4 + Math.log(Math.abs(x[j]))), 2.0));
                }
                if (a[i] == 6 || a[i] >= 11 && a[i] <= 14 || a[i] == 18) {
                    A[i][j] = Math.pow(Math.pow(Math.E, Math.sin(Math.tan(x[j]))),
                            Math.asin(Math.cos(x[j])) / 4);
                }
            }
        }

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%10.5f" + " ", A[i][j]);
            }
            System.out.println();
        }
    }
}
