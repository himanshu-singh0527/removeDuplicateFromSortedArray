import java.util.*;
class Solution{
    public int  removeDuplicates(int nums[]){
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
public class removeDuplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);
        System.out.println("remove duplicate from the sorted array is :" +newLength);

    }
}