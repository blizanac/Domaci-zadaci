package domaci17;

public  class Macka extends Zivotinja {
//    Mačka ima atribut za težinu i metodu koja i
//    spisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je težina preko 5kg.

    private int chonk;

    public Macka(String ime , String nadimak, int chonk) {
        super(ime,nadimak);
        this.chonk = chonk;
    }

    public int getChonk() {
        return chonk;
    }

    public void setChonk(int chonk) {
        if (chonk>0){
            this.chonk = chonk;
        }else {
            System.out.println("Nevalidan unos, pokusajte ponovo!");
        }
    }


    public String imAChonkOrNot(){
        if(chonk>5){
            String a="Im a chonk!";
            return a;
        }else {
            String b= "Im not chonk!";
            return b;
        }
    }

    public  String zvuk(){
        String a="Meoow";
        return a;
    }

    @Override
    public String toString() {
        return "Macka{" +
                "chonk=" + chonk +
                " ,Otput: " + imAChonkOrNot() +
                " , Zvuk macke je: " + zvuk()+
                "} " + super.toString();
    }
}
