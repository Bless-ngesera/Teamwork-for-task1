import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ViewCatalogueDialog extends JDialog {
    public ViewCatalogueDialog(Frame owner, MusicCatalogue catalogue) {
        super(owner, "Music Catalogue Entries", true);
        setSize(300, 200);
        setLocationRelativeTo(owner);

        List<MusicEntry> entries = catalogue.getEntries();
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        for (MusicEntry entry : entries) {
            textArea.append(entry.toString() + "\n");
        }

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        add(closeButton, BorderLayout.SOUTH);
    }
}