package Semester_1.Minggu_04;

public class Exercise15 {
    public static void main(String[] args) {
        int SIZE = 7;
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < -4 * i + (4 * SIZE + 2); j++) {
                System.out.print("!");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
