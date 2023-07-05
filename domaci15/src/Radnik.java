package domaci15;

public class Radnik {

    String ime;
    String prezime;
    int godinaZaposljenja;

    public Radnik (){

    }

    public Radnik(String ime,String prezime,int godinaZaposljenja){
        this.ime=ime;
        this.prezime=prezime;
        this.godinaZaposljenja=godinaZaposljenja;
    }


    public boolean provera (int godinaZaposljenja){
        int  trenutnaGodina=2023;
        if((trenutnaGodina-godinaZaposljenja)>10){
            return true;
        }else {
            return false;
        }
    }
}
