class Solution {

    int index = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {

            if (Character.isDigit(s.charAt(index))) {

                int num = 0;

                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++;

                String decoded = decodeString();

                index++;

                while (num-- > 0) {
                    result.append(decoded);
                }

            } else {
                result.append(s.charAt(index));
                index++;
            }
        }

        return result.toString();
    }
    
}