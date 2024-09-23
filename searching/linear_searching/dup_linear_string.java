package searching.linear_searching;

import javax.print.DocFlavor.STRING;

public class dup_linear_string {
    public static void main(String[] args) {
        String str="vickyAcharjee";
        char target='v';
        System.out.println(stringSearch(str, target));
    }
    static boolean stringSearch(String name, char target){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==target) {
                return true;
            }
        }
        return false;
    }
   
}
