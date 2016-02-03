/**
 * Created by user on 03.02.2016.
 */
import java.util.Random;
public class CreateMatrix {
    int[][]A = new int[3][3];
    int[][]B = new int[3][3];
    int[][]C = new int[3][3];
    public void Create(){
        for(int r=0; r< A.length; r++){
            for(int c=0; c< A[r].length; c++){
                Random rand= new Random();
                A[r][c]= rand.nextInt(9);
                B[r][c]= rand.nextInt(9);

            }}
    }
}
