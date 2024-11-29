package object;

import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.read;

public class OBJ_Chest extends SuperObject {
    public OBJ_Chest(){
        name = "Chest";
        try {
            image = read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("objects/chest.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
