package arrays.searchingAlgorithm;

import java.awt.image.BandedSampleModel;
import java.util.Arrays;

public class BinaraySearchFor2Darray {
    public static void main(String[] args) {
//        question1();
        question2();
    }

    static void question1 (){ // for both col and row sorted array

        int[][] matrix= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int [] ans=Search(matrix,100);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search (int[][] matrix,int traget){// for col and row wise sorted matrix
        int r=0;
        int c=matrix.length-1;

        while (r<matrix.length&& c>=0) {
            if(matrix[r][c]==traget) return new int[]{r,c};

            if (matrix[r][c]<traget){
                r++;
            }else {
                c--;
            }

        }

        return new int[]{-1,-1};
    }

    static int [] Search2 (int [][] matrix,int traget){ //fully sorted array
        int r = matrix.length;
        int c=matrix[0].length;//be cautious matrix may be empty
    if (r==1){
        return simpleBinarySearch(matrix,0,0,c-1,traget);
    }
    int rstart =0;
    int rend= r-1;
    int cmid = c/2;
    int rmid = rstart+(rend-rstart)/2;

    // run loop until only 2 rows is left
        while (rstart<(rend-1)){
            if (matrix[rmid][cmid]==traget){
                return new int[]{rmid,cmid};
            }
            if (matrix[rmid][cmid]<traget){
                rstart=rmid;
            }else {
                rend=rmid;
            }
        }

        if (matrix[rstart][cmid]==traget) {
            return new int[]{rstart,cmid};
        }

        if (matrix[rstart+1][cmid]==traget) {
            return new int[]{rstart+1,cmid};
        }

        //search in 1 hafe
        if (traget<=matrix[rstart][cmid-1]){
            return simpleBinarySearch(matrix,rstart,0,cmid-1,traget);
        }
        //search in 2 hafe
        if (traget>=matrix[rstart][cmid+1] && traget<=matrix[rstart][c-1]){
            return simpleBinarySearch(matrix,rstart,cmid+1,c-1,traget);
        }
        //search in 3 hafe
        if (traget<=matrix[rstart+1][cmid-1]){
            return simpleBinarySearch(matrix,rstart+1,0,cmid-1,traget);
        }
        //search in 4 hafe
        else {
            return simpleBinarySearch(matrix,rstart+1,cmid+1,c-1,traget);
        }




    }

// search in the row provided
    static int[] simpleBinarySearch(int[][] matrix,int row,int cstart,int cend,int traget){
            while (cstart<=cend){
                int mid = cstart+(cend-cstart)/2;

                if (matrix[row][mid]==traget) {
                    return new int[]{row,mid};
                }
                if (matrix[row][mid]<traget){
                    cstart=mid+1;
                }else {
                    cend=mid-1;
                }
            }
            return new int[]{-1,-1};
    }

    static void question2(){
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
            int[] ans = Search2(matrix,3);
        System.out.println(Arrays.toString(ans));
    }
}
