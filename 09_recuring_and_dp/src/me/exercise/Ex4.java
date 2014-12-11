package me.exercise;

import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/10/14.
 */
public class Ex4 {
    // generate all subsets of a set
    public static ArrayList<ArrayList<Integer>>getAllSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
        allSubsets.add(new ArrayList<Integer>());
        for (int i = 0; i < set.size(); i++) {
            int item = set.get(i);
            ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubset.add(newSubset);
            }
            allSubsets.addAll(moreSubset);
        }
        return allSubsets;
    }

    public static ArrayList<ArrayList<Integer>> getAllSubsetsBinary(ArrayList<Integer> set) throws Exception{
        int size = set.size();
        if (size > 31) throw new Exception("Can not generate subsets of a sets contains more than 31 elements");

        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < Math.pow(2, size); i++) {
            ArrayList<Integer> newSubset = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) > 0) newSubset.add(set.get(j));
            }
            allSubsets.add(newSubset);
        }
        return allSubsets;
    }
}
