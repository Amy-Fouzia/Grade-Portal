package javafinalproject;
import java.util.ArrayList;
 
class MergeSort{
    public static class thread_class extends Thread{
        @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
        thread_class(Integer[] array, int start, int end){
            super(()->{
                MergeSort.mergeSort(array, start, end);
            });
            this.start();
        }
    }
     
    public static void threadSort(Integer[] nums){
        //divide work evenly
        int length = nums.length;
        int segSize;
        
        if(length % 4 == 0){segSize = length / 4;}
            else{segSize =  length/(4-1);}
        
        if(segSize < 4){segSize = 4;}
       
        ArrayList<thread_class> threads = new ArrayList<>();
        
        for(int i=0; i < length; i += segSize){
            int st = i;
            int end;
            int rest = (length) - i;
            if(rest < segSize){end = i+(rest-1);} else{end = i+(segSize - 1);}
            final thread_class t = new thread_class(nums, st, end);
            threads.add(t);
        }
        
        for(Thread t: threads){
            try{
                t.join();
            } catch(InterruptedException ignored){
            
            }
        }
       
        for(int i=0; i < length; i += segSize){
            int end;
            int mid;
            int rest = (length)-i;
            if(i == 0){mid = 0;} else{mid = i-1;}
            if(rest < segSize){end = i+(rest-1);} else{end = i+(segSize - 1);}
            merge(nums, 0, mid, end);
        }

    }
 
    public static void mergeSort(Integer[] nums, int start, int end){
        //recursion
        if (start<end){
            int mid = (start + end)/2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(Integer[] nums, int start, int mid, int end){
        //just merge
        Integer[] temp = new Integer[(end-start)+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if (nums[i] <= nums[j]){
                temp[k] = nums[i];
                i+=1;
            }else{
                temp[k] = nums[j];
                j+=1;
            }
            k+=1;
        }
 
        while(i<=mid){
            temp[k] = nums[i];
            i+=1; k+=1;
        }
        
        while(j<=end){
            temp[k] = nums[j];
            j+=1; k+=1;
        }
 
        for(i= start, k = 0; i <= end; i++, k++){
            nums[i] = temp[k];  
        }
    }
}