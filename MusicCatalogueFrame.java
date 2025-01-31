import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicCatalogueFrame extends JFrame {
    private JTextField artistField;
    private JTextField studioField;
    private JComboBox<String> categoryComboBox;
    private JCheckBox availableCheckBox;
    private MusicCatalogue catalogue;

    public MusicCatalogueFrame() {
        catalogue = new MusicCatalogue();

        setTitle("Music Catalogue");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My Music Catalogue", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton viewCatalogueButton = new JButton("View Catalogue");
        JButton exitButton = new JButton("Exit");
        buttonPanel.add(submitButton);
        buttonPanel.add(viewCatalogueButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        JPanel categoryPanel = new JPanel();
        categoryPanel.setLayout(new BoxLayout(categoryPanel, BoxLayout.Y_AXIS));

        JButton rapButton = new JButton("Rap");
        JButton reggaeButton = new JButton("Reggae");
        JButton balladsButton = new JButton("Ballads");
        rapButton.addActionListener(e -> categoryComboBox.setSelectedItem("Rap"));
        reggaeButton.addActionListener(e -> categoryComboBox.setSelectedItem("Reggae"));
        balladsButton.addActionListener(e -> categoryComboBox.setSelectedItem("Ballads"));

        categoryPanel.add(rapButton);
        categoryPanel.add(reggaeButton);
        categoryPanel.add(balladsButton);
        add(categoryPanel, BorderLayout.WEST);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Artist Name:"));
        artistField = new JTextField();
        inputPanel.add(artistField);

        inputPanel.add(new JLabel("Recording Studio:"));
        studioField = new JTextField();
        inputPanel.add(studioField);

        inputPanel.add(new JLabel("Category:"));
        categoryComboBox = new JComboBox<>(new String[]{"Rap", "Reggae", "Ballads"});
        inputPanel.add(categoryComboBox);

        inputPanel.add(new JLabel("Available:"));
        availableCheckBox = new JCheckBox();
        inputPanel.add(availableCheckBox);

        add(inputPanel, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artist = artistField.getText();
                String studio = studioField.getText();
                String category = (String) categoryComboBox.getSelectedItem();
                boolean available = availableCheckBox.isSelected();

                MusicEntry entry = new MusicEntry(artist, studio, category, available);
                catalogue.addEntry(entry);
                artistField.setText("");
                studioField.setText("");
                availableCheckBox.setSelected(false);
                System.out.println("Entry added: " + entry);
            }
        });

        viewCatalogueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewCatalogueDialog dialog = new ViewCatalogueDialog(MusicCatalogueFrame.this, catalogue);
                dialog.setVisible(true);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}