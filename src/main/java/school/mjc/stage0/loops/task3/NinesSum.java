package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int digit = 9;
        int summ = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            summ += digit;
            digit = Integer.valueOf((String.valueOf(digit) + "9"));
        }

        System.out.println(summ);
    }
}