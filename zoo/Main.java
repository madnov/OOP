package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> noise = new ArrayList<>();
        noise.add(new Cat());
        noise.add(new Dog());
        noise.add(new Radio());

        ZooNoise zooNoise = new ZooNoise(noise);
        zooNoise.speakAll();
    }
}
