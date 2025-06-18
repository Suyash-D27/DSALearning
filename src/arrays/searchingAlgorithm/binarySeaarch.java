package arrays.searchingAlgorithm;

public class binarySeaarch {
    public static void main(String[] args) {
            int[]array={2,3,4,5,6,7,12,34,45,56,78,90};
            int traget=100;
            int ans=BinarySearch(array,traget);
        System.out.println("index is :"+ans);
    }

    // return index
    // return -1
    static int BinarySearch (int [] arr,int traget){
            int start=0;
            int end =arr.length-1;
            boolean IsAsc = arr[start]<arr[end];
            while (start <= end){
                int mid = start+(end -start)/2;

                if (arr[mid]==traget) return mid;


                if(IsAsc){
                    if (traget<arr[mid]){
                        end=mid-1;
                       }
                    else{
                        start=mid+1;
                         }
                }
                else {
                        if (traget>arr[mid]){
                            end=mid-1;
                        }
                        else {
                            start=mid+1;
                        }
                    }


            }
        return -1;
    }


}
