package searching.linear_searching;

public class linear_search_String {
    public static void main(String[] args) {
        String[] name={"hey","there","i","am","vicky"};
        String target="vicky";

        int res=searcInString(name,target);
        System.out.println(res);
    }

    static int searcInString(String[] arr, String target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i; 
            }
        }
        return -1;
    }
    
}
