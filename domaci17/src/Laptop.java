package domaci17;

public class Laptop extends Racunar {
    private String velicinaEkrana;
    private Tastatura tastatura;


    public Laptop(String brojpeocesora, String kolicinRamMemorije, String kolicinaMemorije, String velicinaEkrana, Tastatura tastatura) {
        super(brojpeocesora, kolicinRamMemorije, kolicinaMemorije);
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura=tastatura;



    }

    public String getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(String velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }
    public void tastatura (Tastatura tastatura){
        this.tastatura=tastatura;
    }



    @Override
    public String toString() {
        return  super.toString()+" ekran: "+velicinaEkrana+" tastatura: "+tastatura ;
    }
}