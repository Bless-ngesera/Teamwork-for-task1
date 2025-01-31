import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicCatalogueFrame frame = new MusicCatalogueFrame();
            frame.setVisible(true);
        });
    }
}