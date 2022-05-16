package music_sheets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Save your tears is a song. For more details, please visit https://www.youtube.com/watch?v=pQ0DOToHVhs
 * <p>
 * This class contains the music sheet which will have all the notes line by line.
 * Also, it contains the notes key ids.
 */
public class SaveYourTears {
    /**
     * Music sheet with all the notes line by line
     */
    private final LinkedHashMap<String, List<String>> musicSheet = new LinkedHashMap<>();

    /**
     * Notes with key ids
     */
    private final HashMap<String, String> notesWithKeyId = new HashMap<>();

    /**
     * Constructor
     */
    public SaveYourTears() {
        //Populating musicSheet
        musicSheet.put("Line1", Arrays.asList("p", "s", "s"));
        musicSheet.put("Line2", Arrays.asList("s"));
        musicSheet.put("Line3", Arrays.asList("s", "s", "p", "s", "d", "a"));
        musicSheet.put("Line4", Arrays.asList("o", "a", "a"));
        musicSheet.put("Line5", Arrays.asList("a"));
        musicSheet.put("Line6", Arrays.asList("o", "o", "o", "a", "s", "s"));
        musicSheet.put("Line7", Arrays.asList("p", "s", "s"));
        musicSheet.put("Line8", Arrays.asList("s"));
        musicSheet.put("Line9", Arrays.asList("p", "s", "p", "s", "d", "a"));
        musicSheet.put("Line10", Arrays.asList("o", "a", "a"));
        musicSheet.put("Line11", Arrays.asList("a"));
        musicSheet.put("Line12", Arrays.asList("o", "o", "o", "a", "s", "s"));
        musicSheet.put("Line13", Arrays.asList("g", "f", "g", "f"));
        musicSheet.put("Line14", Arrays.asList("g"));
        musicSheet.put("Line15", Arrays.asList("g", "f", "f"));
        musicSheet.put("Line16", Arrays.asList("g", "g", "f", "g", "f"));
        musicSheet.put("Line17", Arrays.asList("g", "f", "g", "f"));
        musicSheet.put("Line18", Arrays.asList("d"));
        musicSheet.put("Line19", Arrays.asList("g", "g", "f", "f"));
        musicSheet.put("Line20", Arrays.asList("g", "g", "f"));
        musicSheet.put("Line21", Arrays.asList("g", "f"));

        //Mapping notes with respective method names
        //in simple words mapping keyboard keys with their element ids
        notesWithKeyId.put("a", "key_59");
        notesWithKeyId.put("d", "key_62");
        notesWithKeyId.put("f", "key_64");
        notesWithKeyId.put("g", "key_65");
        notesWithKeyId.put("o", "key_55");
        notesWithKeyId.put("p", "key_57");
        notesWithKeyId.put("s", "key_60");
    }

    /**
     * Returns musicSheet
     *
     * @return musicSheet
     */
    public HashMap<String, List<String>> getMusicSheet() {
        return musicSheet;
    }

    /**
     * Returns notesWithKeyId
     *
     * @return notesWithKeyId
     */
    public HashMap<String, String> getNotesWithKeyId() {
        return notesWithKeyId;
    }
}
