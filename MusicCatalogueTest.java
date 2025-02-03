package Unknown;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.*;

public class MusicCatalogueTest {
    private MusicCatalogue catalogue;

    @BeforeMethod
    public void setUp() {
        catalogue = new MusicCatalogue();
    }

    @Test
    public void testAddEntry() {
        MusicEntry entry = new MusicEntry("Sunday", "Zanna", "Pop", true);
        catalogue.addEntry(entry);

        List<MusicEntry> entries = catalogue.getEntries();
        assertEquals(entries.size(), 1, "Catalogue should contain one entry");
        assertEquals(entries.get(0).getArtistName(), "Sunday", "Artist name should match");
        assertEquals(entries.get(0).getRecordingStudio(), "Zana", "Recording studio should match");
        assertEquals(entries.get(0).getCategory(), "Pop", "Category should match");
        assertTrue(entries.get(0).isAvailable(), "Availability should be true");
    }

    @Test
    public void testGetEntries() {
        MusicEntry entry1 = new MusicEntry("Sunday", "Zana", "Pop", true);
        MusicEntry entry2 = new MusicEntry("Ali", "AllStar", "Rock", false);

        catalogue.addEntry(entry1);
        catalogue.addEntry(entry2);

        List<MusicEntry> entries = catalogue.getEntries();
        assertEquals(entries.size(), 2, "Catalogue should contain two entries");

        assertEquals(entries.get(1).getArtistName(), "Ali", "Second entry should be Ali");
        assertEquals(entries.get(1).getCategory(), "Rock", "Second entry category should be Rock");
        assertFalse(entries.get(1).isAvailable(), "Second entry should not be available");
    }
}
