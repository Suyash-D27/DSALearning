package arrays.String;

public class Main {

    public static void main(String[] args) {
        String name ="suyash";
        System.out.println(name);
        SB();
    }

    static void SB(){// string bulider class
        StringBuilder bulider = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch= (char) ('a'+i);
            bulider.append(ch);
        }

        System.out.println(bulider.toString());
    }

}
