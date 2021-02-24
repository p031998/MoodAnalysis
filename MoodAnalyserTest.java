package javasample4;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {


    private static final String Assert = null;

	@Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }
}
   
