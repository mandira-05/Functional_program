import java.io.PrintWriter;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for rows");
        int r = scanner.nextInt();
        System.out.println("Enter value for columns");
        int c = scanner.nextInt();

        System.out.println("For Integer select 1, for Double select 2 and for boolean select 3");
        System.out.println("Enter choice for type of array");
        int choice= scanner.nextInt();

        if (choice == 1) {
            Integer [][] int_arr = new Integer [r][c];
            System.out.println("Enter elements");
            for (int i=0;i<r;i++) {
                for (int j=0;j<c;j++) {
                    int_arr[i][j]=scanner.nextInt();
                }
            }
            printarr(int_arr);

        } else if (choice==2) {

            Double[][] doub_arr = new Double[r][c];
            System.out.println("Enter elements");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    doub_arr[i][j] = scanner.nextDouble();
                }
            }
            printarr(doub_arr);
        }  else if (choice==3) {

            Boolean[][] bool_arr = new Boolean[r][c];
            System.out.println("Enter elements as true or false only");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    bool_arr[i][j] = scanner.nextBoolean();
                }
            }
            printarr(bool_arr);

        } else {
                System.out.println("Enter valid option");
            }


        }
    private static <P> void printarr( P [][] array) {
    //private static <P> void printarr( bool_arr) {
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+ " ");
                //PrintWriter writer;
                //writer.write(array[i][j]+ " ");

            }
            System.out.println();
        }
    }

}