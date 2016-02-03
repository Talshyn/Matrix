/**
 * Created by user on 03.02.2016.
 */

public class Multiplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CreateMatrix M = new CreateMatrix();
        M.Create();

        System.out.println("Matrix A:");
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){
                System.out.print(M.A[r][c]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix B:");
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){

                System.out.print(M.B[r][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix C=A*B:");
        for(int i=0; i< 3; i++){

            for(int k=0; k<3; k++){
                M.C[k][i]=0;
                for(int m=0; m<3; m++){
                    M.C[k][i]= M.C[k][i]+M.A[k][m]*M.B[m][i];
                }
                  System.out.print(M.C[k][i]+"  ");
            }     System.out.println();

        }

    }


}
