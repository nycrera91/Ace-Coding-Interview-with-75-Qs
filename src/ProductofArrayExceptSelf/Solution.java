package ProductofArrayExceptSelf;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int[] array = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(array)));
    }


    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];


        for(int i = 0, leftProduct = 1; i < length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for(int i = length - 1, rightProduct = 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;

    }
}
