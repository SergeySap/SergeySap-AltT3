
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        String line = in.nextLine();
        String[] getString = line.split(" ");
        x = getString[0];
        z = getString[1];
        y = getString[2];
        if (x.length()>10||z.length()>1||y.length()>10){
            System.out.println("Неверно введенные данные");
            System.exit(0);
        }
        if (x.length()==0||z.length()==0||y.length()==0){
            System.out.println("Один из данных отсутствует");
            System.exit(0);
        }

        int stringLength = x.length();
        String letter1 = (x.substring(0, 1));
        String lastLetter = (x.substring((stringLength - 1), (stringLength)));
        if (letter1.equals("\"") && lastLetter.equals("\"")) {
        } else {
            System.out.println("Первым должно быть слово в кавычках");
            System.out.println("Попробуйте ещё раз");
            System.exit(0);
        }
        x = x.replaceAll("\"", "");


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

                if (i > 10 || i < 0) {
                    System.out.println("Число должнобыть от 0 до 10.");
                    System.out.println("Попробуйте ещё раз");
                    System.exit(0);
                }
                int p;
                String zic = "";
                for (p = 0; p < i; p++) {
                    zic = zic.concat(x);
                    }
                if (zic.length()>=40){
                    zic=zic.substring(0,40);
                    zic=zic+"...";
                }

                System.out.print("\"");
                System.out.print(zic);
                System.out.print("\"");
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.out.println("Неверно введенное второе слово");
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
            int e,r;
            e = x.length()-1;
            r = y.length()-1;
            if (e <= r){
                System.out.print("\"");
                System.out.print("\"");
                System.exit(0);
            }
            char[] charArrayX = x.toCharArray();
            char[] charArrayY = y.toCharArray();
            String substr1 = x.substring(0,e+1);
            for (int i=0;i<y.length();i++) {
                if (charArrayX[e] != charArrayY[r]) {

                    System.out.print("\"");
                    System.out.print(substr1);
                    System.out.print("\"");
                    System.exit(0);
                }
                    e--;
                    r--;
                substr1 = x.substring(0, e + 1);
                }
                System.out.print("\"");
                System.out.print(substr1);
                System.out.print("\"");

        }

    }
}


//class   Inputs
// Inputs inputs1 = new Inputs()
//      inputs1.x , inputs1.y , inputs1.z
//class   Outputs
//class   sum
//class