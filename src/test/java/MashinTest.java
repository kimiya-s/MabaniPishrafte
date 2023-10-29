import Khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_harekat_Konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {


        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");


        boolean ayaHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();


        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);

    }
}
