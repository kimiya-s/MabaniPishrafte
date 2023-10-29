package Khodro;

public class Mashin {
    //Dade:
    boolean ayaDarBazAst;
    boolean ayaRoshanAst;
    String mark;

    Mashin(){

    }

    public Mashin(String mark){
        this.mark = mark;
    }


    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamoush(){
        ayaRoshanAst = false;
    }

    public void bazkardaneDar(){
        ayaDarBazAst = true;
    }

    public void bastaneDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst(){
        if(!ayaDarBazAst && ayaRoshanAst){
            return true;
        }else {
            return false;
        }
    }
}
