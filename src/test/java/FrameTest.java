import org.junit.Assert;
import org.junit.Test;

public class FrameTest {

    @Test
    public void shouldReturnAnScoreWithTheSameValueOfTheSumKnockedPinsInTheTwoRollsIfNoStrike() {

        Frame frame = new Frame(2, 2);
        Assert.assertEquals(4, frame.getScore());
    }
}
