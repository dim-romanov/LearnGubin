package src.learnGubin.lesson3.task2_isSquare;

public class Square {
    public static void main(String[] args) {

        System.out.println(SquareTest.isSquare(-1));
        System.out.println(SquareTest.isSquare(0));
        System.out.println(SquareTest.isSquare(3));
        System.out.println(SquareTest.isSquare(4));
        System.out.println(SquareTest.isSquare(25));
        System.out.println(SquareTest.isSquare(26));
        System.out.println(SquareTest.isSquare(212774281));
    }
}
class SquareTest {
    public static boolean isSquare(int n) {
//        return Math.sqrt(n) % 1 == 0;
        boolean check = false;
        int count = 0;
        if (n < 0) return false;
        if (n == 0) return true;
        while (count*count <= n) {
            if (count * count == n) {
                check = true;
                break;
            } else {
                count++;
            }
        }
        return check; // fix me!
    }
}
