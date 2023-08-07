package myPracticeTab.hashmapandhashtable;

//public class FirstNonRepeatedCharacterInString {
    /*public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = str.length();

        // Scanning the string and building the HashMap
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterHashMap.containsKey(c)) {
                characterHashMap.put(c, characterHashMap.get(c) + 1);
            } else {
                characterHashMap.put(c, 1);
            }
        }

        // Search the Hashtable till you find the first Character whose value is 1
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterHashMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
*/