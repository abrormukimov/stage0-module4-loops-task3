package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int maxValue = first > second ? first : second;
        int minValue = first <= second ? first : second;
        int gcd = 0;

        for (int i = maxValue; i >= 1; i--) {
            if (maxValue % i == 0 && minValue % i == 0 && gcd < i) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}