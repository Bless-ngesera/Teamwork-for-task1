package Unknown;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MusicCatalogueTest {

    @Test
    public void testAddEntry() {
        MusicCatalogue catalogue = new MusicCatalogue();

        MusicEntry entry = new MusicEntry("Ali", "STARStudio", "Rap", true);

        catalogue.addEntry(entry);

        List<MusicEntry> entries = catalogue.getEntries();
        assertEquals(1, entries.size(), "Catalogue should have 1 entry");
        assertEquals(entry, entries.get(0), "The added entry should match");
    }

    @Test
    public void testGetEntries() {
        MusicCatalogue catalogue = new MusicCatalogue();

        assertTrue(catalogue.getEntries().isEmpty(), "Catalogue should be empty initially");

        MusicEntry entry1 = new MusicEntry("Sunday", "All5Studio", "Rap", true);
        MusicEntry entry2 = new MusicEntry("Sunday", "All5Studio2", "Reggae", false);
        catalogue.addEntry(entry1);
        catalogue.addEntry(entry2);
        List<MusicEntry> entries = catalogue.getEntries();
        assertEquals(2, entries.size(), "Catalogue should have 2 entries");
        assertTrue(entries.contains(entry1), "Catalogue should contain entry1");
        assertTrue(entries.contains(entry2), "Catalogue should contain entry2");
    }
}