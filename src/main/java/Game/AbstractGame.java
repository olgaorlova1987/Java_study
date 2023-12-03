package Game;



import lombok.Getter;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private Integer maxTry;
    private GameStatus status;
    private String word;

    @Getter
    List<String> moveHistory; // список для истории

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.status = GameStatus.ACTIVE;
        this.word = generateWord(sizeWord);
        System.out.println(word);
    }

    private String generateWord(Integer sizeWord) {
        List<String> alf = generateCharList();
        String resultWord = "";
        for (int i = 0; i < sizeWord; i++) {
            Integer ind = new Random().nextInt(alf.size());
            resultWord += alf.get(ind);
            alf.remove(ind);
        }
        return resultWord;
    }

    protected abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        Integer cointCow = 0;
        Integer cointBull = 0;
        for (int i = 0; i < value.length(); i++) {
            Character q = value.charAt(i);
            if (word.contains(q.toString())) {
                cointCow++;
                if (q.equals(word.charAt(i))) {
                    cointBull++;
                }
            }
        }
        if (cointBull.equals(word.length())) {
            status = GameStatus.WIN;
            return new Answer(maxTry, cointCow, cointBull);
        }
        if (maxTry == 0) {
            status = GameStatus.LOSE;
            return new Answer(maxTry, cointCow, cointBull);
        }
        return new Answer(maxTry, cointCow, cointBull);
    }



    @Override
    public GameStatus getGameStatus() {
        return status;
    }

}