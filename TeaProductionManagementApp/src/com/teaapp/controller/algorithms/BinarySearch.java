package com.teaapp.controller.algorithms;

import com.teaapp.model.TeaModel;
import java.util.List;

/**
 * Binary Search implementation for searching TeaModel objects by tea name.
 * Note: The list must be sorted by tea name before performing the search.
 */
public class BinarySearch {
    /**
     * Searches for a tea by name in a sorted list of TeaModel objects.
     *
     * @param searchValue the tea name to search for
     * @param teaList the sorted list of TeaModel objects
     * @param left the left boundary index
     * @param right the right boundary index
     * @return the matching TeaModel object, or null if not found
     */
    public TeaModel searchByName(String searchValue, List<TeaModel> teaList, 
            int left, int right) {
        // Base Case - if boundaries cross, element not found
        if (right < left) {
            return null;
        }
        
        // Calculate middle index
        int mid = (left + right) / 2;
        
        // Get the tea name at middle index for comparison
        String midTeaName = teaList.get(mid).getTeaName();
        
        // Compare search value with middle element
        int comparison = searchValue.compareToIgnoreCase(midTeaName);
        
        // If search value matches middle element
        if (comparison == 0) {
            return teaList.get(mid);
        } 
        // If search value is less than middle element, search left half
        else if (comparison < 0) {
            return searchByName(searchValue, teaList, left, mid - 1);
        } 
        // If search value is greater than middle element, search right half
        else {
            return searchByName(searchValue, teaList, mid + 1, right);
        }
    }
}