package Unknown;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ViewCatalogueDialogTest {

    @Test
    public void testDialogDisplaysEntries() {
        // Create a mock MusicCatalogue with sample entries
        MusicCatalogue catalogue = new MusicCatalogue();
        catalogue.addEntry(new MusicEntry("Artist1", "Studio1", "Rap", true));
        catalogue.addEntry(new MusicEntry("Artist2", "Studio2", "Reggae", false));

        ViewCatalogueDialog dialog = new ViewCatalogueDialog(null, catalogue);

        assertEquals("Music Catalogue Entries", dialog.getTitle(), "Dialog title should match");
        assertTrue(dialog.isModal(), "Dialog should be modal");

        assertEquals(new Dimension(300, 200), dialog.getSize(), "Dialog size should match");

        Component[] components = dialog.getContentPane().getComponents();
        JScrollPane scrollPane = (JScrollPane) components[0];
        JTextArea textArea = (JTextArea) scrollPane.getViewport().getView();

        String expectedText = "Artist: Artist1, Studio: Studio1, Category: Rap, Available: true\n" +
                "Artist: Artist2, Studio: Studio2, Category: Reggae, Available: false\n";
        assertEquals(expectedText, textArea.getText(), "Text area should display the correct entries");
    }
}