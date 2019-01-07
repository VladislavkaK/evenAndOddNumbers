package task.fromJavarush;

import java.io.*;

public class EvenAndOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sNum = br.readLine();

        for (int i = 0; i < sNum.length(); i++) {
            int nNum = Integer.parseInt(Character.toString(sNum.charAt(i)));

            if (nNum % 2 == 0) {
                EvenAndOdd.even++;
            } else if (nNum % 2 != 0) {
                EvenAndOdd.odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
