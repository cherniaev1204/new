package nre;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NewTry {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fact = Integer.parseInt(reader.readLine());
        int storage = 1;
        for (int i = 1; i <= fact; i++) {
            storage = storage * i;
            if (i == fact) {
                break;
            }
        }
        System.out.println(storage);
    }
}
