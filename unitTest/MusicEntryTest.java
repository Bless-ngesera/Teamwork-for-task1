package Unknown;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicEntryTest {

    @Test
    public void testConstructor() {
        MusicEntry entry = new MusicEntry("Artist1", "Studio1", "Rap", true);
    }

    @Test
    public void testToString() {

        MusicEntry entry = new MusicEntry("Artist1", "Studio1", "Rap", true);
        String expectedString = "Artist: Artist1, Studio: Studio1, Category: Rap, Available: true";
        assertEquals(expectedString, entry.toString(), "toString output should match");
    }
}