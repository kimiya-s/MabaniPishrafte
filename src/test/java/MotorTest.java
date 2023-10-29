import Khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {
    @Test
    void Motor_Bayad_harekat_Konad_Vaghti_Roshan_Ast() {


        Motor motor = new Motor();


        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();


        assertTrue(ayaHarekatMikonad);

    }
}
