package domaci15;

public class Film {

    String ime;
    String reziser;
    int godinaObjave;


    public Film(){


    }


    public Film (String ime,String reziser,int godinaObjave){

        this.ime=ime;
        this.reziser=reziser;
        this.godinaObjave=godinaObjave;
    }



public int godinaStarosti (int godinaObjave){
        int trenutnagodina=2023;
        return trenutnagodina-godinaObjave;
}
}
