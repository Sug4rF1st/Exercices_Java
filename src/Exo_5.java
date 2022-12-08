import java.util.Scanner;

public class Exo_5 {
    public static String conversionSec(int sec) {
        int h = sec/3600;
        int m = (sec%3600)/60;
        int s = (sec%60);
        return h+":"+m+":"+s;
    }
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les secondes : ");
        int sec = clavier.nextInt();
        System.out.println("il était " + conversionSec(sec) + " à ce moment précis!");
    }
}
