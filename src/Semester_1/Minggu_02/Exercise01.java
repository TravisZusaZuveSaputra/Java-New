package Semester_1.Minggu_02;

public class Exercise01 {
    public static void main(String[] args) {
        break1();
        break2();
        break2();
        verse1();
    }
    public static void verse1() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }
    public static void verse2() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
    public static void break1() {
        verse1();
        System.out.println();
    }
    public static void break2() {
        verse1();
        verse2();
        verse1();
        System.out.println();
    }
}