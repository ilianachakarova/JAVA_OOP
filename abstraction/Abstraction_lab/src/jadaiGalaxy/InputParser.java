package jadaiGalaxy;

import java.util.Arrays;

public class InputParser {
    public static int[] readArray(String input){
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}
