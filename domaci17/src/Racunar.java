package domaci17;

public class Racunar {
    protected String brojpeocesora;
    protected String kolicinRamMemorije;
    protected String kolicinaMemorije;


    public Racunar(String brojpeocesora, String kolicinRamMemorije, String kolicinaMemorije) {
        this.brojpeocesora = brojpeocesora;
        this.kolicinRamMemorije = kolicinRamMemorije;
        this.kolicinaMemorije = kolicinaMemorije;
    }

    public String getBrojpeocesora() {
        return brojpeocesora;
    }

    public void setBrojpeocesora(String brojpeocesora) {
        this.brojpeocesora = brojpeocesora;
    }

    public String getKolicinRamMemorije() {
        return kolicinRamMemorije;
    }

    public void setKolicinRamMemorije(String kolicinRamMemorije) {
        this.kolicinRamMemorije = kolicinRamMemorije;
    }

    public String getKolicinaMemorije() {
        return kolicinaMemorije;
    }

    public void setKolicinaMemorije(String kolicinaMemorije) {
        this.kolicinaMemorije = kolicinaMemorije;
    }

    @Override
    public String toString() {
        return "Broj procesora: " + brojpeocesora + "ram: " + kolicinRamMemorije+ " memorija: "+kolicinaMemorije;
    }
}
