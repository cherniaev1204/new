package nre;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s = buffer.readLine();
            if (s.equals("стоп"))
                break;
            int a = Integer.parseInt(s);
            sum = sum + a;

        }
        System.out.println(sum);
    }
}
