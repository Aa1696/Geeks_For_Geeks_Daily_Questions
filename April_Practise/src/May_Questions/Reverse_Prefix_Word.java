package May_Questions;

public class Reverse_Prefix_Word {
    public String reversePrefix(String word, char ch) {
        int indx = -1;
        String left = "";
        for(int i=0;i<word.length();i++){
            char chr = word.charAt(i);
            left = chr + left;
            if(chr==ch){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            return word;
        }
        String right = word.substring(indx+1);
        return left + right;
    }
}
