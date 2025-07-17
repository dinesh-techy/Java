package interview;

import java.util.ArrayList;
import java.util.List;

public class Perm {
    public static void main(String[] args) {

        //Input: nums = [1,2,3]Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

        int [] nums = {1,2,3};

        List<List<Integer>> permutationList = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int j=0;
            while(j<i){
                list.add(nums[j]);
            }

            if(list.size()>nums.length){
                list=new ArrayList<>();
            }
        }


    }
}
