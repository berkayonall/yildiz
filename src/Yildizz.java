import java.util.Scanner;
public class Yildizz {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        int n = klavye.nextInt();


        for (int i =0 ; i <=n ; i++){
            for (int j = 0;j <=(n-1);j++){
                System.out.print(" ");

            }
            for (int k=1; k<=(2*i+1);k++ ){
                System.out.print("*");

            }
            System.out.println(" ");



        }


    }
}

