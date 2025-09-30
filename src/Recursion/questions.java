package Recursion;

public class questions {
    public static void main(String[] args) {
        question1("", "baccad");
        System.out.println(question1b("baccadhad"));
        System.out.println(question1c("bapplecdfsdappledsas"));
    }

    static void question1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            question1(p, up.substring(1));
        } else {
            question1(p + ch, up.substring(1));
        }
    }


    static String question1b(String p) {
        if (p.isEmpty()) {
            return "";
        }

        char ch = p.charAt(0);

        if (ch == 'a') {
            return question1b(p.substring(1));
        } else {
            return ch + question1b(p.substring(1));
        }

    }

    static String question1c(String p) {
        if (p.isEmpty()) {
            return "";
        }

        if (p.startsWith("apple")) {
            return question1c(p.substring(5));
        } else {
            return p.charAt(0) + question1c(p.substring(1));
        }
    }
}