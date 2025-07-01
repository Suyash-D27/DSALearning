package bitwiseAndNumberSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class factors {
    public static void main(String[] args) {
        int n=36;
        fac(n);
    }

    private static void  fac(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <=n ; i++) {
            if(n%i==0){
                if(n/i==i){
                    list.add(i);
                } else {
                list.add(i);
                list.add(n/i);
              }
            }
        }
        Collections.sort(list);

        System.out.println(list);
    }
}
