package Unknown;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

class MusicCatalogueFrameTest {

    @Test
    public void testFrameInitialization() {
        MusicCatalogueFrame frame = new MusicCatalogueFrame();

        assertEquals("Music Catalogue", frame.getTitle(), "Frame title should match");
        assertEquals(new Dimension(400, 300), frame.getSize(), "Frame size should match");

        assertNotNull(frame.artistField, "Artist field should be initialized");
        assertNotNull(frame.studioField, "Studio field should be initialized");
        assertNotNull(frame.categoryComboBox, "Category combo box should be initialized");
        assertNotNull(frame.availableCheckBox, "Available check box should be initialized");
    }

    @Test
    public void testSubmitButtonAction() {
        // Create the frame
        MusicCatalogueFrame frame = new MusicCatalogueFrame();

        // Simulate user input
        frame.artistField.setText("Artist1");
        frame.studioField.setText("Studio1");
        frame.categoryComboBox.setSelectedItem("Rap");
        frame.availableCheckBox.setSelected(true);
         }
    }
