public class MashinTest {

    class Mashin{
        //Dade:
        boolean ayaDarMashinBazAst;
        boolean ayaMashinRoshanAst;

        //Tabe (method ) :
        void roshan(){
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush(){
            System.out.println("Mashin khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void bazkardaneDar(){
            System.out.println("Dar baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastaneDar(){
            System.out.println("Dar baste ast");
            ayaDarMashinBazAst = false;
        }

        void harekat(){
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin Dar Hale Harekat Ast");
            }else {
                System.out.println("Mashin Park Ast");
            }
        }
    }
}
