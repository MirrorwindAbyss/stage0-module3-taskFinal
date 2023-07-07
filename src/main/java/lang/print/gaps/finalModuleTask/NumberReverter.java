package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first, second, third;
        first = number/100;
        second = number/10%10;
        third = number%10;
        System.out.println(third + "" + second + "" + first);
    }
}
