package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> firstCopy = new ArrayList<>(first);
        ArrayList<Integer> secondCopy = new ArrayList<>(second);
        Collections.reverse(firstCopy);
        Collections.reverse(secondCopy);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(firstCopy.size(), secondCopy.size()); i++){
            int firstVal = i < firstCopy.size() ? firstCopy.get(i) : 0;
            int secondVal = i < secondCopy.size() ? secondCopy.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = 0;
            if (total >= 10){
                complement = 1;
                total -= 10;
            }
            result.add(i, total);
        }
        if (complement > 0) {
            result.add(complement);
        }

        Collections.reverse(result);
        return result;
    }
}
