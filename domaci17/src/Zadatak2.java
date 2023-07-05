package domaci17;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napraviti klasu koja predstavlja računar.
//        Računar ima broj procesora, količinu ram memorije i količinu memorije.
//        Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
//        Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana
//        i enum za tastaturu (da li je internacionalna ili US). Isto implementirati toString,
//        samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB," +
//        " memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL" Napraviti klasu mobilni " +
//        "telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i " +
//        "enum za mrežu koju podržava (3G, 4G, 5G). Implementirati toString metodu da ispisuje " +
//        ""Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G". " +
//        "U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada " +
//        "(Da li je laptop ili mobilni).


        Laptop laptop1 = new Laptop("4", "16", "256GB", "15,6", Tastatura.INTERNACIONAL);
        Laptop laptop2 = new Laptop("4", "16", "256GB", "15,6", Tastatura.US);
        Mobilni mobilni1=new Mobilni("4","16BG","256GB",32,Mreza.G3);
        Mobilni mobilni2=new Mobilni("4","16BG","256GB",32,Mreza.G4);


        ArrayList <Racunar> uredjaji=new ArrayList<>();
        uredjaji.add(laptop1);
        uredjaji.add(laptop2);
        uredjaji.add(mobilni1);
        uredjaji.add(mobilni2);

        for ( Racunar u : uredjaji){
            if(u instanceof Mobilni){
                System.out.println("Mobilni:");
                System.out.println(uredjaji.toString());
            }else if (u instanceof Laptop){
                System.out.println("Laptop:");
                System.out.println(uredjaji.toString());
            }
        }
    }
}
