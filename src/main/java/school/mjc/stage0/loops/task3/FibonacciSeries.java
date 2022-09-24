package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) { // 5
        if (lastFibonacci <= 2) {
            System.out.println("0\n1");
        } else {
            System.out.println(0);
            System.out.println(1);

            int counter = 2;
            int left = 0;
            int mem = 1;
            int right = 1;

            while (counter < lastFibonacci) {
                right = left + mem;
                left = mem;
                mem = right;

                counter++;
                System.out.println(right);
            }
        }
    }
}