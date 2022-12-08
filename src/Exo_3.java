import java.util.Scanner;

public class Exo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une température en °F");
        int F = sc.nextInt();
        double C = (5.0/9)*(F-32);
        System.out.println(F+" fahrenheit = "+C+" Celsius");
    }
}
