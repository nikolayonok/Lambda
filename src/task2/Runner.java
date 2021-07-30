package task2;

public class Runner {
    public static void main(String[] args) {
        testMinMax((aa, bb) -> {
            int cc = 0;
            if (aa > bb) {
                cc = aa;
            } else {
                cc = bb;
            }
            return "Max " + cc;
        });

        testMinMax((aa, bb) -> {
            int cc = 0;
            if (aa > bb) {
                cc = bb;
            } else {
                cc = aa;
            }
            return "Min " + cc;
        });
    }

    public static void testMinMax(MinMaxInter minMaxInter) {
        System.out.println(minMaxInter.minMax(5, 10));
    }
}
