import java.io.*; 
import java.util.*; 

public class ArrayList {

   public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println(a[1]);
        System.out.println("____________________");
        for (int temp: a) {
            System.out.println(temp);
        }
        System.out.println("____________________");
        int x[] = new int[4];
        x[0] = 10;
        x[3] = 20;
        for (int temp: x) {
            System.out.println(temp);
        }

        System.out.println("____________________");
        String[] y = new String[4];
        y[1] = "10";
        y[3] = "20";
        for (String temp: y) {
            System.out.println(temp);
        }

        // two dimensional arrays
        int temp = 10;
        int [][] arr = new int[5][3];
        for(int i=0; i<5; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j] = temp;
                temp += 10;
            }
        }
        for(int i=0; i<5; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int [] b = {1,2,3,4};
        System.out.print(b);
    }

}

