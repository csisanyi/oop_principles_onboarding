package main.java.Training;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] inputArray, int target){

        HashMap<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++){
            int diff = target - inputArray[i];
            if (twoSumMap.containsKey(diff)){
                return new int[]{twoSumMap.get(diff),i};
            }
            twoSumMap.put(inputArray[i], i);
        }
        throw new IllegalArgumentException("Hibas input");
    }
}

/*int[] i = {1,2,3,4};
System.out.println(Arrays.toString(TwoSum.twoSum(i, 4)));*/