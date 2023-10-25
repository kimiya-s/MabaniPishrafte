import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_harekat_Konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {

        //Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHaleHarekatAst();

        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);

//        Mashin mashin = new Mashin();
//        mashin.bazkardaneDar();
//        mashin.bastaneDar();
//        System.out.println("Aya dar mashin baz ast ? " + mashin.ayaDarMashinBazAst);
//        mashin.harekat();
//
//        System.out.println("----------------------------------");
//
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazkardaneDar();
//        pride.harekat();
    }

    class Mashin{

        //Dade:
        boolean ayaDarMashinBazAst;
        boolean ayaMashinRoshanAst;
        String mark;

        //constractor
        Mashin(){

            out.println("Yek Mashin Bedone Dade Sakhte shod");
        }

        Mashin(String mark){
            this.mark = mark;
            out.println("Yek Mashine " + this.mark + " sakhte shod");
        }

        //Tabe (methode ) :
        void roshan(){
            out.println(mark + " roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush(){
            out.println(mark +" khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void bazkardaneDar(){
            out.println("Dar " + mark + " baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastaneDar(){
            out.println("Dar " + mark +" baste ast");
            ayaDarMashinBazAst = false;
        }

        boolean ayaMashinDarHaleHarekatAst(){
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println(mark +" Dar Hale Harekat Ast");
                return true;
            }else {
                out.println(mark+ " Park Ast");
                return false;
            }
        }
    }
}
