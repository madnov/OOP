package zoo;

import java.util.List;

public class ZooNoise {
    private List<Speakable> noise;

    public ZooNoise(List<Speakable> noise) {
        this.noise = noise;
    }

    public void speakAll() {
        for (Speakable speakable  : noise) {
            speakable.speak();
        }
    }
}
