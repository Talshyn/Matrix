/**
 * Created by user on 03.02.2016.
 */
import java.util.Random;
public class Multiplication {
    static int[][]A = new int[3][3];
    static int[][]B = new int[3][3];
    static int[][]C = new int[3][3];
    static int c;
    static int i;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Create();
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){


                System.out.print(A[r][c]);
            }
            System.out.println();
        }
        System.out.println();
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){

                System.out.print(B[r][c]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i< 3; i++){

            for(int k=0; k<3; k++){
                C[k][i]=0;
                for(int m=0; m<3; m++){
                    C[k][i]= C[k][i]+A[k][m]*B[m][i];
                }System.out.print(C[k][i]+"  ");

            }
            System.out.println();

        }

    }

    public static void Create(){
        for(int r=0; r< A.length; r++){
            for(int c=0; c< A[r].length; c++){
                Random rand= new Random();
                A[r][c]= rand.nextInt(9);
                B[r][c]= rand.nextInt(9);

            }}}
}
