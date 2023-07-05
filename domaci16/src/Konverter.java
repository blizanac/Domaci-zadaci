package domaci16;

public class Konverter {

    private double rsd;
    private Valuta valuta;


    public Konverter() {

    }

    public Konverter(double rsd, domaci16.Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public void setRsd(double rsd) {
        this.rsd = rsd;
    }

    public void valuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public double konvertovanje() {
        double kurs = 0;
if(rsd>0) {
    if (valuta.equals(domaci16.Valuta.EUR)) {
        kurs = 117.27;
    } else if (valuta.equals(valuta.USD)) {
        kurs = 108.77;
    } else if (valuta.equals(valuta.AUD)) {
        kurs = 71.766;
    } else if (valuta.equals(valuta.CAD)) {
        kurs = 80.566;
    } else if (valuta.equals(valuta.RUB)) {
        kurs = 1.3578;
    } else if (valuta.equals(valuta.GBP)) {
        kurs = 135.240;
    }
}else {
    System.out.println("Morate uneti broj veci od nule.");
}
        return rsd / kurs;
    }


}

