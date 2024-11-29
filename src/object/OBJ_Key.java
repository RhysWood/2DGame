package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.*;

public class OBJ_Key extends SuperObject {
    public OBJ_Key(){
        name = "Key";
        try {
            image = read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("objects/key.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
