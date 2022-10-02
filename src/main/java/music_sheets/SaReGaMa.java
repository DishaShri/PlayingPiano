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
public class SaReGaMa {
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
    public SaReGaMa() {
        //Populating musicSheet
        musicSheet.put("Line1", Arrays.asList("*", "(", "q", "Q", "W", "E", "t", "T", "T", "t", "E", "W", "Q", "q", "(", "*"));

        //Mapping notes with respective method names
        //in simple words mapping keyboard keys with their element ids
        notesWithKeyId.put("*", "key_37");
        notesWithKeyId.put("(", "key_39");
        notesWithKeyId.put("q", "key_41");
        notesWithKeyId.put("Q", "key_42");
        notesWithKeyId.put("W", "key_44");
        notesWithKeyId.put("E", "key_46");
        notesWithKeyId.put("t", "key_48");
        notesWithKeyId.put("T", "key_49");
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
