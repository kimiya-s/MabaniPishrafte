package Khodro;

public class Motor {

    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamoush(){
        ayaRoshanAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        return ayaRoshanAst;
    }
}
