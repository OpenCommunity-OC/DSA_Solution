package Questions.Searching.binarySearch;

public class dup_smallestLetter {
    public static void main(String[] args) {
     char[] letters={'c','f','j'};
     char target='a';
     char res=smallestLetter(letters, target);
     System.out.println(res);   
    }
    static char smallestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<letters[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
