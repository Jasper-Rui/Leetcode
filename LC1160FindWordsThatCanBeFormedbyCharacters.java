/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-21
 * Time: 11:45
 * Description:
 */
public class LC1160FindWordsThatCanBeFormedbyCharacters {
    public static int countCharacters(String[] words, String chars) {

        int sum = 0;

        if(chars == null || chars.equals("")) return 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);

            if(hashMap.containsKey(ch)) {
                int oldval = hashMap.get(ch);
                hashMap.replace(ch, oldval + 1);
            }
            else {
                hashMap.put(ch, 1);
            }
        }


        for(int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                if(temp.containsKey(ch)) {
                    int oldval = temp.get(ch);
                    temp.put(ch, oldval + 1);
                }
                else{
                    temp.put(ch, 1);
                }
            }

            boolean flg = false;

            for (Character ch : temp.keySet()) {
                if(!hashMap.containsKey(ch)){
                    flg = false;
                    break;
                }
                else if(hashMap.containsKey(ch) && hashMap.get(ch) >= temp.get(ch)) {
                    flg = true;
                }
                else if(hashMap.containsKey(ch) && hashMap.get(ch) < temp.get(ch)) {
                    flg = false;
                    break;
                }
            }

            if(flg) {
                sum += words[i].length();
            }

        }
        return sum;
    }
}
