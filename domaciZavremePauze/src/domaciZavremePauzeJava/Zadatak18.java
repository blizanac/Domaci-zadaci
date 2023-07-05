package domaciZavremePauzeJava;

public class Zadatak18 {
    public static void main(String[] args) {

//        Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b).
//        Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika.
//        Pozvati 3 puta metod sa razlicitim vrednostima.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Unesite stranicu a: ");
//        double stranicaA = input.nextDouble();
//        System.out.println("Unesite stranicu b: ");
//        double stranicaB= input.nextDouble();

        double stranicaA = 5;
        double stranicaB = 5;
        double stranicaC = 250;
        double stranicaD = 1115;
        double stranicaE = 52;
        double stranicaF = 50;


        System.out.println("Povrsina pravougaonika je: " + povrsinaPravugaonika(stranicaA, stranicaB) + "m2.");
        System.out.println("Povrsina pravougaonika je: " + povrsinaPravugaonika(stranicaC, stranicaD) + "m2.");
        System.out.println("Povrsina pravougaonika je: " + povrsinaPravugaonika(stranicaE, stranicaF) + "m2.");
    }

    public static double povrsinaPravugaonika(double a, double b) {

        double povrsina = 0;

        if (a > 0 && b > 0) {
            povrsina = a * b;
        }

        return povrsina;
    }
}
