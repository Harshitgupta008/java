import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            // Your code goes here
            String str[] = s.split("");
            String store = "";
            String answer = "";
            for (int num = 0; num < str.length; num++) {
                store = store.concat(str[num]);
                if (store.length() == 2) {
                    switch (store) {
                        case "00":
                            answer = answer.concat("A");
                            break;
                        case "01":
                            answer = answer.concat("T");
                            break;
                        case "10":
                            answer = answer.concat("C");
                            break;
                        case "11":
                            answer = answer.concat("G");
                            break;
                    }
                    store = "";
                }
            }
            System.out.println(answer);

        }
    }
}