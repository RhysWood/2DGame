package object;

import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.read;

public class OBJ_Door extends SuperObject {
    public OBJ_Door(){
        name = "Door";
        try {
            image = read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("objects/door.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
