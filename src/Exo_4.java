import java.util.Scanner;

public class Exo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une note de devoir surveillé");
        int nbr1 = sc.nextInt();
        System.out.println("Entrez une note d'interrogation");
        int nbr2 = sc.nextInt();
        System.out.println("Entrez une note de travaux pratique");
        int nbr3 = sc.nextInt();

        System.out.println("La moyenne est de : "+(nbr1*3 + nbr2*2 + nbr3) / 6);

    }
}
