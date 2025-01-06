import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
    String str = "Hello";
if(str == "Hello") {
    System.out.println("Same!");
}
    }

    static int sort(int[] nums){
        int i=0;

        while (i<nums.length) {
            int current=nums[i]-1;

            if( nums[i]!= nums[current]){
                swap(nums, i, current);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

     int findMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = 0; i < end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void bubble(int[] arr){
        boolean swapped;
        int n =arr.length;
        // run step n-1 times
        for(int i=0;i<n-1;i++){
            swapped=false;
            // for each step, max item will come at the last respective index
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if no two elements were swapped in the inner loop, then the array is sorted
            if(!swapped){
                break;
            }
        }
    }
     
}