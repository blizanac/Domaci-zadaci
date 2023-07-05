package domaci17;

public abstract class Zivotinja {
//    Napraviti apstraktnu klasu koja će da predstavlja životinju.
//    životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.

    protected String ime;
    protected String nadimak;

    public Zivotinja(String ime, String nadimak) {
        this.ime = ime;
        this.nadimak = nadimak;
    }

    public abstract String zvuk();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'' +
                '}';
    }
}
