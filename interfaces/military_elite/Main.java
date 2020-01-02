package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.core.Engine;
import abstraction_and_interfaces.military_elite.core.EngineImpl;
import abstraction_and_interfaces.military_elite.utils.readers.ConsoleReader;
import abstraction_and_interfaces.military_elite.utils.readers.InputReader;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleReader();
        Engine engine = new EngineImpl(reader);
        engine.run();
    }

}
