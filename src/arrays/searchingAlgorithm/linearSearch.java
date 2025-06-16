package arrays.searchingAlgorithm;

public class linearSearch {
    public static void main(String[] args) {
        int[]array={1,2,5,9,76,98,65,89,67};
            int traget = 98;
//            int ans=searchAlgo(array,traget);
//        System.out.println(ans);
//        String name="suyash";
//        char traget2= 'u';

//        int ans2 = searchInRange(array,traget,3,7);
//        System.out.println(ans2);

        int [] formin ={23,23,456,67,76,34,56,78};
        int ans3 = min(formin);
        System.out.println(ans3);
    }


    static int searchAlgo (int [] arr,int traget){

        if (arr.length==0){
            return -1;
        }

            for (int index = 0; index < arr.length; index++) {
                int element= arr[index];
                if (element==traget){
                    return index;
                }
            }
            return -1;
        }

    static boolean searchString( String str,char traget2){
          if (str.length()==0){
              return false;
          }
        for (int i = 0; i < str.length(); i++) {
            if (traget2==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static int searchInRange (int[] arr, int traget, int start, int end){
        if (arr.length==0) return -1;

        if (end>arr.length) return -1;

        for (int index = start; index <= end; index++) {
            int element= arr[index];
            if (element==traget){
                return index;
            }
        }
        return -1;

    }

    static int min (int[] arr){
        int ans = arr[0];
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]<ans) ans=arr[index];
        }
        return ans;
    }

}
