import java.util.Scanner;

public class startCalc {

    public static void main(String[] args) {
        String x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        String line = in.nextLine();
        String[] getString = line.split(" ");
        x = getString[0];
        z = getString[1];
        y = getString[2];
        if (x.length() > 10 || z.length() > 1 || y.length() > 10) {
            System.out.println("Неверно введенные данные");
            System.exit(0);
        }
        if (x.length() == 0 || z.length() == 0 || y.length() == 0) {
            System.out.println("Один из данных отсутствует");
            System.exit(0);
        }
        Inputs one = new Inputs();
        one.x = x;
        one.y = y;
        one.z = z;
        one.calc();
    }
}
