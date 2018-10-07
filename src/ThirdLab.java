import java.util.Scanner;

public class ThirdLab {
    public static void main(String[] args) {
        ThirdLab.firstTask();
//        ThirdLab.secondTask();
    }

    private static void firstTask() {
        for (int degree = 2; degree < 101; degree++) {
            for (int a = 1; a < 101; a++) {
                int aStep = (int) Math.pow(a, degree);

                for (int b = 1; b < 101; b++) {
                    int bStep = (int) Math.pow(b, degree);

                    for (int c = 1; c < 101; c++) {
                        int cStep = (int) Math.pow(c, degree);

                        if (aStep + bStep == cStep) {
                            System.out.println(
                                "For " + degree +  " degree result:\n" +
                                "a: " + a + " b: " + b + " c: " + c
                            );
                        }
                    }
                }
            }
        }
    }

    private static void secondTask() {
        double result = 0;

        for (int index = 0; index < 10000; index++) {
            final double step = (double) 1 / (index + 1);

            result += (index % 2 == 0) ? step : -step;
        }

        System.out.println("Result is " + result);
    }
}
