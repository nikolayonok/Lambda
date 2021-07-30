package task1;

import java.util.Date;


public class Runner {
    public static void main(String[] args) {
//        FuncInterface summa = (x, y, z) -> {
//            return
//                    x + y + z;
//        };
//        System.out.println(summa.sum(2, 4, 6));
//        test((x, y, z) -> x + y + z);
//        test((x, y, z) -> x * y * z);
        DateInter dateInter = date -> String.format("%d:%d:%d", date.getHours(), date.getMinutes(), date.getSeconds());
        DateInter dateInter1 = date -> date.toString();

        System.out.println(dateInter.getDate((new Date())));
        System.out.println(dateInter1.getDate((new Date())));
    }

    public static void test(FuncInterface funcInterface) {
        System.out.println(funcInterface.sum(10, 20, 30));
    }

}

