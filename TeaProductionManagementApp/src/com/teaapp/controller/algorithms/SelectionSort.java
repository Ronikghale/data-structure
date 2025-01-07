/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teaapp.controller.algorithms;

import com.teaapp.model.TeaModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronikghale
 */
public class SelectionSort {
    private List<TeaModel> teaSortList;

    public SelectionSort() {
        teaSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of TeaModel objects based on the specified field in ascending or descending order.
     *
     * @param teaList the list of TeaModel objects to be sorted
     * @param field the field to sort by (e.g., "teaId", "teaName", "pricePerKg")
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<TeaModel> sort(List<TeaModel> teaList, String field, boolean isDesc) {
        this.teaSortList.clear();
        this.teaSortList.addAll(teaList);
        if (teaSortList == null || teaSortList.isEmpty()) {
            throw new IllegalArgumentException("Tea list cannot be null or empty.");
        }

        for (int i = 0; i < teaSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(teaSortList, i, field, isDesc);
            if (i != extremumIndex) {
                swap(teaSortList, i, extremumIndex);
            }
        }

        return teaSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list for the specified field.
     *
     * @param teaSortList the list of TeaModel objects
     * @param startIndex the index to start searching from
     * @param field the field to sort by
     * @param isDesc specifies whether to find the maximum (true) or minimum (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<TeaModel> teaSortList, int startIndex, String field, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < teaSortList.size(); j++) {
            if (shouldSwap(getFieldValue(teaSortList.get(j), field),
                           getFieldValue(teaSortList.get(extremumIndex), field), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Compares two values to determine if they should be swapped based on the sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the current value should replace the extremum; false otherwise
     */
    private boolean shouldSwap(Comparable current, Comparable extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    /**
     * Extracts the value of the specified field from a TeaModel object.
     *
     * @param tea the TeaModel object
     * @param field the field to retrieve
     * @return the value of the specified field
     */
    private Comparable getFieldValue(TeaModel tea, String field) {
    return switch (field.toLowerCase()) {
        case "teaid" -> tea.getTeaId();
        case "teaname" -> tea.getTeaName();
        case "priceperkg" -> tea.getPricePerKg();
        case "harvestinglocation" -> tea.getHarvestingLocation();
        case "teatype" -> tea.getTeaType();
        case "quality" -> tea.getQuality();
        case "harvesteddate" -> tea.getHarvestedDate(); // LocalDate implements Comparable
        case "exportstatus" -> tea.getExportStatus();
        default -> throw new IllegalArgumentException("Unknown field: " + field);
    };
}


    /**
     * Swaps two elements in the list.
     *
     * @param teaSortList the list of TeaModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<TeaModel> teaSortList, int i, int j) {
        TeaModel temp = teaSortList.get(i);
        teaSortList.set(i, teaSortList.get(j));
        teaSortList.set(j, temp);
    }
}
    

