package domaci16;

import java.util.ArrayList;

public class Zadatak1 {

//    Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci
//    ArrayList<Integer>. Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer>
//    kao parametar. Distinct vraća novi ArrayList<Integer> dok ostale metode imaju
//    povratne tipove tipa int (za min, max i sum) i double (za avg).

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(-1);
        list1.add(0);
        list1.add(20);
        list1.add(20);

        System.out.println(list1);

        System.out.println(min(list1));
        System.out.println(max(list1));
        System.out.println(sum(list1));
        System.out.println(avg(list1));
        System.out.println(distinct(list1));

    }

    public static int min(ArrayList<Integer> lista) {
        int c = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) < c) {
                c = lista.get(i);
            }
        }
        return c;

    }

    public static int max(ArrayList<Integer> lista) {
        int c = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) > c) {
                c = lista.get(i);
            }
        }
        return c;

    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> lista) {
        int c = 0;
        for (int i = 0; i < lista.size(); i++) {

            c += lista.get(i);
        }
        return (double) c / lista.size();

    }

    public static ArrayList distinct(ArrayList<Integer> lista1) {
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (!lista2.contains(lista1.get(i))) {
                lista2.add(lista1.get(i));
            }
        }
        return lista2;
    }
}
