import java.util.Scanner;
public class Inputs {
    String x, y, z;
    void calc() {
        char operation = z.charAt(0);
        if (operation == '*' || operation == '/' || operation == '+' || operation == '-') {

        } else {
            System.out.println("Недопустимый оператор или отсутствует");
            System.out.println("Попробуйте ещё раз");
            System.exit(0);
        }
        if (operation == '*') {
            try {
                int i = Integer.parseInt(y.trim());

                if (i > 10 || i <= 0) {
                    System.out.println("Число должнобыть от 1 до 10.");
                    System.out.println("Попробуйте ещё раз");
                    System.exit(0);
                }
                int p;
                String zic = "";
                for (p = 0; p < i; p++) {
                    zic = zic.concat(x);
                }
                if (zic.length() >= 40) {
                    zic = zic.substring(0, 40);
                    zic = zic + "...";
                }
                System.out.print("\"");
                System.out.print(zic);
                System.out.print("\"");
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.out.println("Число должно быть от 1 до 10 без кавычек.");
                System.out.println("Попробуйте ещё раз");
            }
        }
        if (operation == '/') {
            try {
                int i = Integer.parseInt(y.trim());

                if (i > 10 || i <= 0) {
                    System.out.println("Число должно быть от 1 до 10.");
                    System.out.println("Попробуйте ещё раз");
                    System.exit(0);
                }
                int p;
                p = x.length() / i;
                int start = 0;
                int end = p;
                char[] dst = new char[end - start];
                x.getChars(start, end, dst, 0);
                System.out.print("\"");
                System.out.print(dst);
                System.out.print("\"");
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.out.println("Неверно введенный оператор");
            }
        }
        int stringLength2 = y.length();
        String letter2 = (y.substring(0, 1));
        String lastLetter2 = (y.substring((stringLength2 - 1), (stringLength2)));
        if (letter2.equals("\"") && lastLetter2.equals("\"")) {

        } else {
            System.out.println("Второе слово должно быть в кавычках");
            System.out.println("Попробуйте ещё раз");
            System.exit(0);
        }
        y = y.replaceAll("\"", "");

        if (operation == '+') {
            x = x.concat(y);

            System.out.print("\"");
            System.out.print(x);
            System.out.print("\"");
            System.exit(0);
        }

        if (operation == '-') {
            try {
                int xIndex = x.indexOf(y);
                int xLindex = xIndex + (y.length());
                String xOut = x.substring(xIndex, xLindex);
                    System.out.print("\"");
                    System.out.print(x.replace(xOut, ""));
                    System.out.print("\"");
                    System.exit(0);
                }

            catch (Exception e) {
                System.out.print("\"");
                System.out.print(x);
                System.out.print("\"");
                System.exit(0);
            }

        }
    }
}

class startCalc {

    public static void main(String[] args) {
        String x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        String line = in.nextLine();
        String letter1 = (line.substring(0, 1));
        if (letter1.equals("\"")) {
        } else {
            System.out.println("Первым должно быть слово в кавычках");
            System.out.println("Попробуйте ещё раз");
            System.exit(0);
        }
        String[] getX = line.split("\" ", 2);
        x = getX[0];

        try {
            x = x.replaceAll("\"", "");
            String[] getYZ = getX[1].split(" ");
            z = getYZ[0];
            y = getX[1].substring(2);
            if (x.length() > 10 || z.length() > 1 || y.length() > 10) {
                System.out.println("Неверно введенная строка");
                System.exit(0);
            }
            if (x.length() == 0 || z.length() == 0 || y.length() == 0) {
                System.out.println("Неверно введенная строка");
                System.exit(0);
            }
            Inputs one = new Inputs();
            one.x = x;
            one.y = y;
            one.z = z;
            one.calc();

        } catch (Exception e) {
            System.out.println("Неверно введенная строка");

        }
    }
}
