class Solution {
    public boolean hasSameDigits(String s) {
        int[] numArray = s.chars().map(c -> c - '0').toArray();

        while (numArray.length > 2) {
            int[] newArray = new int[numArray.length - 1];
            for (int i = 0; i < numArray.length - 1; i++) {
                newArray[i] = (numArray[i] + numArray[i + 1]) % 10;
            }
            numArray = newArray; // Update numArray with the new sequence
        }

        // Return whether the final two digits are the same
        return numArray[0] == numArray[1];
    }
}
