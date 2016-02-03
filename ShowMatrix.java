/**
 * Created by user on 03.02.2016.
 */
public class ShowMatrix extends CreateMatrix {

    public void Show(){
        System.out.println("Matrix A:");
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){
                System.out.print(A[r][c]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix B:");
        for(int r=0; r< 3; r++){
            for(int c=0; c<3; c++){

                System.out.print(B[r][c]);
            }
            System.out.println();
    }
}}
