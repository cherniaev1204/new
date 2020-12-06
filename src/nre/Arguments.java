package nre;

public class Arguments {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        String num2 = args[1];
        int num3 = Integer.parseInt(args[2]);
        int sum = 0;
        switch (num2) {
            case "+":
                sum = num1 + num3;
                System.out.println(sum);
                break;
            case "*":
                sum = num1 * num3;
                System.out.println(sum);
                break;
            case "/":
                if (num1 == 0 || num3 == 0) {
                    System.out.println("Division by zero");
                    break;
                }
                sum = num1 / num3;
                System.out.println(sum);
                break;
            case "%":
                sum = num1 % num3;
                System.out.println(sum);
                break;
            default:
                System.out.println("Ошибка,попробуйте заново!");
        }

    }
}
