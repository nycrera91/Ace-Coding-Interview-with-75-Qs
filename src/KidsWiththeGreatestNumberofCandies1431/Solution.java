package KidsWiththeGreatestNumberofCandies1431;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        List<Boolean> result = new ArrayList<>();

        for(int candy : candies){
            maxCandy = Math.max(candy,maxCandy);
        }

        for (int candy : candies){
            result.add(candy + extraCandies >= maxCandy);
        }
        return result;
    }

}
