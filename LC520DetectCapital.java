/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-25
 * Time: 17:15
 * Description:
 */
public class LC520DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word == null) return false;


        //there are 3 different cases
        //all lower case [97. 122] ASCII
        //all upper case [65. 90] ASCII
        //only charAt(0) is upper

        return isAllLower(word) || isAllUpper(word) || onlyOneCapitals(word);


    }

    private boolean isAllLower (String word) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) < 97 || word.charAt(i) > 122) {
                return false;
            }
        }
        return true;
    }


    private boolean isAllUpper (String word) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) < 65 || word.charAt(i) > 90) {
                return false;
            }
        }
        return true;
    }

    private boolean onlyOneCapitals (String word) {
        if(word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            return isAllLower(word.substring(1));
        }
        return false;
    }

}
