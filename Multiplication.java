/**
 * Created by user on 03.02.2016.
 */

public class Multiplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ShowMatrix S = new ShowMatrix();
        S.Create();
        S.Show();

        System.out.println();
        System.out.println("Matrix C=A*B:");
        for(int i=0; i< 3; i++){

            for(int k=0; k<3; k++){
                S.C[k][i]=0;
                for(int m=0; m<3; m++){
                    S.C[k][i]= S.C[k][i]+S.A[k][m]*S.B[m][i];
                }
                  System.out.print(S.C[k][i]+"  ");
            }     System.out.println();

        }

    }


}
