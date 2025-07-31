class Solution {
    public String[] findWords(String[] words) {
        List<String> rez = new ArrayList<>();

        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (String word : words) {
            boolean r1Contains = false;
            boolean r2Contains = false;
            boolean r3Contains = false;

            for (char ch : word.toLowerCase().toCharArray()) {

                if (r1.indexOf(ch) >= 0) {
                    r1Contains = true;
                } else if (r2.indexOf(ch) >= 0) {
                    r2Contains = true;
                } else if (r3.indexOf(ch) >= 0) {
                    r3Contains = true;
                }

                if ((r1Contains && r2Contains) || (r1Contains && r3Contains) || (r2Contains && r3Contains)) {
                    break;
                }
            }

            int trueCount = (r1Contains ? 1 : 0) + (r2Contains ? 1 : 0) + (r3Contains ? 1 : 0);

            if (trueCount == 1) {
                rez.add(word);
            }
        }

        return rez.toArray(new String[0]);
    }
}