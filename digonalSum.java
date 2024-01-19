//1572. Matrix Diagonal Sum
//leetcode easy 
// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the 
// elements on the secondary diagonal that are not part of the primary diagonal.

public class digonalSum {
    public static int Sum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            sum += mat[i][i];
            if (i!= mat.length-1-i)
            sum += mat[i][mat.length-i-1];
        } 
        System.out.println(sum);
        return sum;
    }

    public static void main (String args[]){
        int mat[][] = {{1,2,3,4,0},
                         {5,6,7,8,0},
                         {9,10,11,12,0},
                         {13,14,15,16,0},
                        {17,18,19,20,0}};
        Sum(mat);

    }
}