package music_sheets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SaveYourTears {
    private final LinkedHashMap<String, List<String>> musicSheet = new LinkedHashMap<>();
    private final HashMap<String, String> notesWithMethodNames = new HashMap<>();

    public SaveYourTears() {
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

        notesWithMethodNames.put("a", "key_59");
        notesWithMethodNames.put("d", "key_62");
        notesWithMethodNames.put("f", "key_64");
        notesWithMethodNames.put("g", "key_65");
        notesWithMethodNames.put("o", "key_55");
        notesWithMethodNames.put("p", "key_57");
        notesWithMethodNames.put("s", "key_60");
    }

    public HashMap<String, List<String>> getMusicSheet() {
        return musicSheet;
    }

    public HashMap<String, String> getNotesWithMethodNames() {
        return notesWithMethodNames;
    }
}
