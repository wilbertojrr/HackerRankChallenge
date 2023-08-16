package HackerRank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int x = 1; x <= n; x++){
                a= a + b;
                System.out.print(a + " ");
                b=b*2;
            }
            System.out.println();
        }
        in.close();
    }
}
