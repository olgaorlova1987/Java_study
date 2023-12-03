package Game;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{
    @Override
    protected List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'а'; i <= 'я'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}



