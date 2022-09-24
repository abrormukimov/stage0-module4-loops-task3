package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int total = 0;
        String string = String.valueOf(t);
        int len = string.length();

        int startPoint = 0;
        if (t < 0) { startPoint = 1; }

        for (int i = startPoint; i < len; i++) {
            int convertedInt = Character.getNumericValue(string.charAt(i));
            total += convertedInt;
        }

        System.out.println(total);
    }
}