public class SearchInStrings {
    public static void main(String[] args) {
        String name = "joe";
        char target = 'o';
        boolean result = search(name, target);
        System.out.println(result);
    }

    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
