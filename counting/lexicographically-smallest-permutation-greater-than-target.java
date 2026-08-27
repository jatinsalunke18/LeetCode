class Solution {
    public String lexGreaterPermutation(String s, String t) {

        int[] freq = new int[26];
        StringBuilder temp = new StringBuilder();

        // Frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {

            int ch = t.charAt(i) - 'a';

            // Same character available
            if (freq[ch] > 0) {
                temp.append(t.charAt(i));
                freq[ch]--;
            }
            else {
                // Find smallest character greater than t[i]
                int j = ch + 1;

                while (j < 26 && freq[j] == 0) {
                    j++;
                }

                if (j < 26) {
                    // We found a greater character
                    temp.append((char) (j + 'a'));
                    freq[j]--;

                    // Put remaining characters in sorted order
                    for (int k = 0; k < 26; k++) {
                        while (freq[k] > 0) {
                            temp.append((char) (k + 'a'));
                            freq[k]--;
                        }
                    }

                    return temp.toString();
                }

                // No greater character available,
                // so we need to backtrack.
                break;
            }
        }

        return "";
    }
}