package Game;


import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {
    @Override
    protected List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}


