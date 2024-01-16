import java.util.Scanner;

public class matrix 
{
    public static boolean search(int matrix_array[][], int key)
    {
        for (int i = 0 ; i < matrix_array.length ; i++)
        {
            for (int j = 0 ; j < matrix_array[0].length ; j++){
                if (matrix_array[i][j] == key){
                    System.out.println("found the key on th postion (" + i + "," + j + ")");
                    return true;
                }
                
            }
        }
            System.out.println("not found");
                    return false;

    
    }

    public static void main(String args[]){
       
        int matrix_array[][] = new int[3][3];
        int n = matrix_array.length , m = matrix_array[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                matrix_array[i][j] = sc.nextInt();
            }

        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.print(matrix_array[i][j] + " ");
            }

            System.out.println();

        }
        search(matrix_array, 4);
       
    }
    
}

