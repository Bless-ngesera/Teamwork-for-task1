package Unknown;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MusicEntryTest {

    @Test
    public void testTestToString() {
        MusicEntry entry = new MusicEntry("Sunday", "Zana", "Pop", true);
        String expected = "Artist: Sunday, Studio: Zana, Category: Pop, Available: true";
        assertEquals(entry.toString(), expected, "toString() method should return the correct formatted string");
    }

    @Test
    public void testGetArtistName() {
        MusicEntry entry = new MusicEntry("Sunday", "Zana", "Pop", true);
        assertEquals(entry.getArtistName(), "Sunday", "Artist name should be Sunday");
    }

    @Test
    public void testGetRecordingStudio() {
        MusicEntry entry = new MusicEntry("Sunday", "Zana", "Pop", true);
        assertEquals(entry.getRecordingStudio(), "Zana", "Recording studio should be Zana");
    }

    @Test
    public void testGetCategory() {
        MusicEntry entry = new MusicEntry("Sunday", "Zana", "Pop", true);
        assertEquals(entry.getCategory(), "Pop", "Category should be Pop");
    }

    @Test
    public void testIsAvailable() {
        MusicEntry entry = new MusicEntry("Sunday", "Zana", "Pop", true);
        assertTrue(entry.isAvailable(), "Availability should be true");
    }
}