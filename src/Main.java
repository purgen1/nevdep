import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ddata = scanner.();
        System.out.println(ddata);
        List<String> data = getData(scanner.next());
        int a = Integer.parseInt(data.get(0));
        String operator = data.get(1);
        int b = Integer.parseInt(data.get(2));
        System.out.println(addition(a, b, operator));
    }

    public static int addition(int a, int b, String operator) {

        int answer = 0;
        switch (operator) {
            case "-":
                answer = a - b;
            case "+":
                answer = a + b;
            case "*":
                answer = a * b;
            case "/":
                answer = a / b;
        }

        return answer;
    }

    public static List<String> getData(String data) {
        List<String> expression = Arrays.asList(data.split(" "));
        System.out.println(expression);
        return expression;
    }
}