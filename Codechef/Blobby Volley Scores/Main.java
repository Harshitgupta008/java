import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            // your code goes here
            int alicePoint = 0;
            int bobPoint = 0;
            
            char server = 'A';
            char reciver = 'B';
            
            for(int i = 0; i<s.length(); i++){
                
                if(server == s.charAt(i)){
                    if(server == 'A'){
                        alicePoint++;
                    }else{
                        bobPoint++;
                    }
                }else{
                    if(server == 'A'){
                        server = 'B';
                    }else{
                        server = 'A';
                    }
                }
            }
            System.out.println(alicePoint+" "+bobPoint);
        }
    }
}