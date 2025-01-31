import java.util.ArrayList;
import java.util.List;
public class MusicCatalogue {
    private List<MusicEntry> entries;
        public MusicCatalogue() {
        entries = new ArrayList<>();
    }

    public void addEntry(MusicEntry entry) {
        entries.add(entry);
    }

    public List<MusicEntry> getEntries() {
        return entries;
    }
}