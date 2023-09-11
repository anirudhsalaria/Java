public class q19_delete_duplicate_words {
    public static void main(String[] args){
        String newStr = "";
        int lengthS = newStr.length();
        String str = "This is a good book";
        int length = str.length();
        for(int i=0;i<length;i++){
            char charAtPosition = str.charAt(i);
            if(newStr.indexOf(charAtPosition)<0){
                newStr+=charAtPosition;
            }
        }
        System.out.println(newStr);
    }
}
