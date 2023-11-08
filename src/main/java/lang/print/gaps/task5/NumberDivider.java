package lang.print.gaps.task5;

public class NumberDivider {
    void divide(float toBeDivided) {
        float result = toBeDivided % 5 + (((toBeDivided % 5) / 10) * 2 - 1);
        System.out.println(result);
    }
}
