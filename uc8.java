import java.util.HashMap;

public class OOPSBannerApp8 {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " *****   ",
                " *    *  ",
                " *    *  ",
                " *****   ",
                " *       ",
                " *       ",
                " *       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder bannerLine = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                bannerLine.append(charMap.get(message.charAt(i))[line]).append("  ");
            }

            System.out.println(bannerLine);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}