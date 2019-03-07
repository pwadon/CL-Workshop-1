package packages.Services;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static packages.Services.PickAGame.pickGame;

class PickAGameTest {

    @Test
    void pickGameTest() {
        String str = "8";

        PickAGame pickAGame = new PickAGame();
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        int result = pickGame();
        assertEquals(8,result);
    }

}