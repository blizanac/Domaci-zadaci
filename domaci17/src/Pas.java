package domaci17;

import com.sun.prism.shader.DrawEllipse_LinearGradient_REFLECT_AlphaTest_Loader;



public class Pas extends Zivotinja {
//    Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy”
//    u zavisnosti od toga da li je promenljiva goodBoy true ili false.

    private boolean goodBoy;


    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy = goodBoy;
    }


    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void  setGoodBoy(boolean goodBoy) {
        this.goodBoy=goodBoy;
    }

    public String zvuk(){
        String a = "Wooof" ;
        return a;
    }

    public String imAGoodOrNot(){
        if (goodBoy==true){
            String a="Im a good boy!";
            return a;
        }else {
            String b="Im a bad boy!";
            return b;
        }
    }

    @Override
    public String toString() {
        return "Pas{" +
                "goodBoy=" + goodBoy +
                " ,Output: " +imAGoodOrNot()+
                " ,Zvuk psa je: " + zvuk()+
                "} " + super.toString();
    }
}

