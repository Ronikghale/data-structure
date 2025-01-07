

package com.teaapp.controller.algorithms;

import com.teaapp.model.TeaModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements Merge Sort for sorting TeaModel objects by TeaType.
 */
public class MergeSort {

    /**
     * Sorts a list of TeaModel objects by their TeaType in ascending or descending order.
     *
     * @param teaList the list of TeaModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<TeaModel> sortByTeaType(List<TeaModel> teaList, boolean isDesc) {
        if (teaList == null || teaList.isEmpty()) {
            throw new IllegalArgumentException("Tea list cannot be null or empty.");
        }

        // Base case: a single element is already sorted
        if (teaList.size() <= 1) {
            return teaList;
        }

        // Split the list into two halves
        int mid = teaList.size() / 2;
        List<TeaModel> left = new ArrayList<>(teaList.subList(0, mid));
        List<TeaModel> right = new ArrayList<>(teaList.subList(mid, teaList.size()));

        // Recursively sort both halves
        left = sortByTeaType(left, isDesc);
        right = sortByTeaType(right, isDesc);

        // Merge the sorted halves
        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted lists into one sorted list by TeaType.
     *
     * @param left the first sorted list
     * @param right the second sorted list
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the merged sorted list
     */
    private List<TeaModel> merge(List<TeaModel> left, List<TeaModel> right, boolean isDesc) {
        List<TeaModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            // Compare TeaType values and sort based on order
            if (shouldPlaceLeft(left.get(i).getTeaType(), right.get(j).getTeaType(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    /**
     * Determines if the left element should be placed before the right element.
     *
     * @param leftValue the TeaType value of the left element
     * @param rightValue the TeaType value of the right element
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the left element should come first; false otherwise
     */
    private boolean shouldPlaceLeft(String leftValue, String rightValue, boolean isDesc) {
        if (leftValue == null) leftValue = "";
        if (rightValue == null) rightValue = "";
        return isDesc ? leftValue.compareTo(rightValue) > 0 : leftValue.compareTo(rightValue) < 0;
    }
}
