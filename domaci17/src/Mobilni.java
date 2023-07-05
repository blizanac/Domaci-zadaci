package domaci17;

public class Mobilni extends Racunar {

    private int kamera;

    private Mreza mreza;

    public Mobilni(String brojpeocesora, String kolicinRamMemorije, String kolicinaMemorije, int kamera, Mreza mreza) {
        super(brojpeocesora, kolicinRamMemorije, kolicinaMemorije);
        this.kamera = kamera;
        this.mreza = mreza;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return  super.toString() + " Kamera:"+kamera+"Megapaskala, mreza: "+mreza.getMreza();
    }
}
