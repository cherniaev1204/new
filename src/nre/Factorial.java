package nre;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println(factorial(num));
    }

    public static int factorial(int fact) {
        int result = 1;
        if (fact == 1 || fact == 0) {
            return result;
        }
        result = fact * factorial(fact - 1);
        return result;
    }
}
