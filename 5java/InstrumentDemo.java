// Q7: Abstract class Instrument and subclasses
abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Glockenspiel: Ding ding ding!");
    }
    @Override
    void tune() {
        System.out.println("Tuning the Glockenspiel: Adjusting metal bars.");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Violin: Sweeping the bow across strings.");
    }
    @Override
    void tune() {
        System.out.println("Tuning the Violin: Tightening the strings.");
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument g = new Glockenspiel();
        Instrument v = new Violin();
        g.play();
        g.tune();
        v.play();
        v.tune();
    }
}
