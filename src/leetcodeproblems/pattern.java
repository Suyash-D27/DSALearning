package leetcodeproblemsSuyash;

public class pattern {
    public static void main(String[] args) {
        solution();
    }

    public static void solution (){
        int count =2;
        for (int i = 0; i < 6 ; i++) {
            int temp= count;
            for (int j = 0; j<=i ; j++) {
                System.out.print(temp-(j)+" ");
                temp = temp-(j);
            }
            System.out.println();
            count=count+(6-i);
        }
    }
}
