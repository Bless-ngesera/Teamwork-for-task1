package Unknown;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import javax.swing.*;

import java.awt.*;

import static org.testng.Assert.*;

public class MusicCatalogueFrameTest {
    private MusicCatalogueFrame frame;

    @BeforeMethod
    public void setUp() {
        SwingUtilities.invokeLater(() -> {
            frame = new MusicCatalogueFrame();
            frame.setVisible(true);
        });
    }

    @Test
    public void testAddEntry() {
        SwingUtilities.invokeLater(() -> {
            frame.artistField.setText("Sunday");
            frame.studioField.setText("Allstar");
            frame.categoryComboBox.setSelectedItem("Rap");
            frame.availableCheckBox.setSelected(true);
            frame.submitButton.doClick();

            assertEquals(frame.catalogue.getEntries().size(), 1, "One entry should be added");
            assertEquals(frame.catalogue.getEntries().get(0).getArtistName(), "Sunday", "Artist name should match");
        });
    }

    @Test
    public void testViewCatalogueButton() {
        SwingUtilities.invokeLater(() -> {
            frame.catalogue.addEntry(new MusicEntry("Ali", "TopStudio", "Reggae", false));
            frame.viewCatalogueButton.doClick();

            JDialog[] dialogs = findOpenDialogs();
            assertTrue(dialogs.length > 0, "View Catalogue dialog should be opened");
        });
    }
    private JDialog[] findOpenDialogs() {
        Window[] windows = Window.getWindows();
        return (JDialog[]) java.util.Arrays.stream(windows)
                .filter(w -> w instanceof JDialog)
                .toArray(JDialog[]::new);
    }
}
