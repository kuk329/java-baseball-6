package baseball.sample.domain;

import java.util.List;

public class Judgment {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result += 1;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
        return computer.get(placeNumber) == number;
//        if (computer.get(placeNumber) == number) {
//            return true;
//        }
//        return false;
    }
}
