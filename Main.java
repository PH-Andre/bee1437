package sargento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        while (N != 0) {

            String texto = scan.next();
            int D = 0;
            int E = 0;


            for (int i = 0; i < N; i++) {
                char teste = texto.charAt(i);

                if ('D' == teste) {
                    D = D+1;

                }
                else {
                    E = E+1;

                }
            }
            if (D - E > 0){
                if ((D - E) % 4 == 3){
                    System.out.println("O");
                }
                else if((D - E) % 4 == 2){
                    System.out.println("S");
                }
                else if((D - E) % 4 == 1){
                    System.out.println("L");
                }
                else{
                    System.out.println("N");
                }
            }
            else if(D - E < 0){

                    if ((E-D) % 4 == 3){
                        System.out.println("L");
                    }
                    else if((E-D)  % 4 == 2){
                        System.out.println("S");
                    }

                    else if((E-D)  % 4 == 1){
                        System.out.println("O");
                    }

                    else{
                        System.out.println("N");
                    }
            }
            else{
                System.out.println("N");
            }
            N = scan.nextInt();
        }
    }
}
