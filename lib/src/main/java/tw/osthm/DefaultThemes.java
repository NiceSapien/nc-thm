package tw.osthm;

import java.util.ArrayList;
import java.util.HashMap;

import static tw.osthm.osthmEngine.metadataVersion;

public class DefaultThemes {

    /*
     * Vanilla theme default colors:
     * colorPrimary:            -14575885
     * colorPrimaryText:        -1
     * colorPrimaryDark:        -15242838
     * colorStatusbarTint:       1
     * colorBackground:         -1
     * colorBackgroundText:     -16777216
     * colorAccent:             -720809
     * colorAccentText:         -1
     * shadow:                   1
     * colorControlHighlight:    1073741824
     * colorHint:               -5723992
     * colorPrimaryTint:        -1
     * colorBackgroundTint:     -16777216
     * colorPrimaryCard:        -1
     * colorBackgroundCard:     -1
     * colorPrimaryCardText:    -16777216
     * colorBackgroundCardText: -16777216
     * colorPrimaryCardTint:    -16777216
     * colorBackgroundCardTint: -16777216
     * colorDialog:             -1
     * colorDialogText:         -16777216
     * colorDialogTint:         -16777216
     */

    public static ArrayList<HashMap<String, Object>> getDefaultThemes() {
        ArrayList<HashMap<String, Object>> defaultThemes = new ArrayList<>();
        defaultThemes = new ArrayList<>();
        defaultThemes.add(0, addKeyToHashMap("themesname", "Light"));
        defaultThemes.get(0).put("themesjson", "{\"colorPrimary\":-1,\"colorBackgroundCardTint\":-7762803,\"colorPrimaryDark\":-1,\"colorBackgroundText\":-16777216,\"colorBackground\":-1,\"shadow\":1,\"colorDialog\":-1,\"colorPrimaryTint\":-10983950,\"colorHint\":-6381922,\"colorStatusbarTint\":0,\"colorDialogTint\":-10983950,\"colorPrimaryCardTint\":-10983950,\"colorPrimaryText\":-10983950,\"colorAccent\":-10983950,\"colorBackgroundCardText\":-16777216,\"colorBackgroundTint\":-16777216,\"colorControlHighlight\":1073741824,\"colorAccentText\":-1,\"colorDialogText\":-10983950,\"colorBackgroundCard\":-1,\"colorPrimaryCardText\":-16777216,\"colorPrimaryCard\":-1}");
        defaultThemes.get(0).put("themesinfo", "Light theme of Discord and nc-thm");
        defaultThemes.get(0).put("themesauthor", "Discord, Inc and NiceSapien");
        defaultThemes.get(0).put("os-thm-version", metadataVersion);
        defaultThemes.get(0).put("uuid", "dark");
        defaultThemes.get(0).put("theme-version", 2);
        defaultThemes.add(1, addKeyToHashMap("themesname", "Dark"));
        defaultThemes.get(1).put("themesjson", "{\"colorPrimary\":-13749191,\"colorBackgroundCardTint\":-7762803,\"colorPrimaryDark\":-13749191,\"colorBackgroundText\":-1,\"colorBackground\":-14473430,\"shadow\":1,\"colorDialog\":-14473430,\"colorPrimaryTint\":-1,\"colorHint\":-6381922,\"colorStatusbarTint\":1,\"colorDialogTint\":-1,\"colorPrimaryCardTint\":-14473430,\"colorPrimaryText\":-1,\"colorAccent\":-10983950,\"colorBackgroundCardText\":-1,\"colorBackgroundTint\":-1,\"colorControlHighlight\":1073741824,\"colorAccentText\":-1,\"colorDialogText\":-1,\"colorBackgroundCard\":-14473430,\"colorPrimaryCardText\":-16777216,\"colorPrimaryCard\":-1}");
        defaultThemes.get(1).put("themesinfo", "The default(dark) theme of Discord and nc-thm");
        defaultThemes.get(1).put("themesauthor", "Discord, Inc and NiceSapien");
        defaultThemes.get(1).put("os-thm-version", metadataVersion);
        defaultThemes.get(1).put("uuid", "default");
        defaultThemes.get(1).put("theme-version", 2);
        return defaultThemes;
    }

    // Utilites
    // =============================================================================================

    /**
     * This method returns a HashMap containing
     * the given key and object. Used as Util in
     * ncthm
     *
     * @param key   Key
     * @param value Value
     * @return HashMap containing the given key and value
     */

    private static HashMap<String, Object> addKeyToHashMap(String key, Object value) {
        HashMap<String, Object> hashmap = new HashMap<>();
        hashmap.put(key, value);
        return hashmap;
    }
}
