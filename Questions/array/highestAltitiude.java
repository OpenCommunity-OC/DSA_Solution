package Questions.array;
// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
public class highestAltitiude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(highestAltitiude(gain));
    }
    static int highestAltitiude(int[] gain){
        int current =0;
        int max     =0;
        for (int i = 0; i < gain.length; i++) {
            current=current+gain[i];
            max=Math.max(current,max);
        }
        return max;
    }
    
}
