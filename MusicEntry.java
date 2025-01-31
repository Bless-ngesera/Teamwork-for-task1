public class MusicEntry {
    private String artistName;
    private String recordingStudio;
    private String category;
    private boolean available;

    public MusicEntry(String artistName, String recordingStudio, String category, boolean available) {
        this.artistName = artistName;
        this.recordingStudio = recordingStudio;
        this.category = category;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Artist: " + artistName + ", Studio: " + recordingStudio + ", Category: " + category + ", Available: " + available;
    }
}
