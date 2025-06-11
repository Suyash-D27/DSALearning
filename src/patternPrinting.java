public class patternPrinting {

    static int n=5;
    static int m=5;
  static int number= 1;

   static void question_1(){
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   static void question_2(){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=m ; j++) {
               if ((i == 1) || (i == n) || (j == 1) || (j == m)){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }

   }

   static void question_3(){
       for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=i ; j++) {
               System.out.print("*");

           }
           System.out.println();
       }
   }

   static void question_4(){
       for (int i = n; i >=1; i--) {
       for (int j = 1; j <=i ; j++) {
           System.out.print("*");

       }
       System.out.println();
   }

   }

   static void question5(){
       //outer loop
       for (int i = 1; i <=n; i++) {
           //inner loops for spaces printing
           for (int j = 1; j <=n-i; j++) {
               System.out.print(" ");

           }
           //outer loops for star printing
           for (int j = 1; j <=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

   }

   static void question6(){
       for (int i = 1; i <=n; i++) {
          for (int j =1; j <=i ; j++) {
           System.out.print(j);
          }
       System.out.println();
   }

   }

   static void question7(){
       for (int i = 1; i <=n ; i++) {
           for (int j =1; j <=m-i+1; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
   }

   static void question8(){
       for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=i; j++) {
               System.out.print(" "+number);
               number++;
           }
           System.out.println();
       }
   }

   static void question9(){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=i ;j++) {
               int sum =i+j;
               if (sum%2==0){
                   System.out.print("1");
               }else System.out.print("0");
           }
           System.out.println();
       }

   }

    static void question10(){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   static void question11(){
       for (int i = 1; i <=n; i++) {
           for (int j = 1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=n ; j++) {
               System.out.print("*");

           }
           System.out.println();
       }

   }

   static void question12(){
       for (int i = 1; i <=n ; i++) {
           //spaces
           for (int j = 1; j <=n-i ; j++) {
               System.out.print(" ");
           }
           //numbers
           for (int j = 1; j <=i ;j++) {
               System.out.print(i+" ");
           }

           System.out.println();
       }

   }

   static void question13(){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=n-i ; j++) {
               System.out.print(" ");
           }
           for (int j = i; j >=1 ; j--) {
               System.out.print(j);
           }
           for (int j = 2; j <=i ; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
       
   }

   static void question14() {
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           for (int j = 2; j <=i ; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i = n; i >=1; i--) {
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           for (int j = 2; j <=i ; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

   }



    public static void main(String[] args) {
//        question_1();
//        question_2();
//        question_3();
//        question_4();
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11();
//        question12();
//        question13();
        question14();

    }

}
