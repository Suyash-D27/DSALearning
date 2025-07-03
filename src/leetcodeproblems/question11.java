package leetcodeproblems;

public class question11 {
    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(solution(arr));
    }

    static int solution (int[] height){
        int area=0;
        int left =0;
        int right = height.length-1;
       while (left<right){
           int space= Math.abs(left-right);
           int Hmin= Math.min(height[left],height[right]);

           area=Math.max(area,space*Hmin);

           if(height[left]<height[right]){
               left++;
           }else right--;


       }
       return area;
    }
}
