package Game;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Answer {
    private Integer numTry;
    private Integer cow;
    private Integer bull;

    public Answer(Integer numTry, Integer cow, Integer bull) {
        this.numTry = numTry;
        this.cow = cow;
        this.bull = bull;
    }

    public Integer getNumTry() {
        return numTry;
    }

    public void setNumTry(Integer numTry) {
        this.numTry = numTry;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }
}