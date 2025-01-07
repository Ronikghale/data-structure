/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teaapp.controller.algorithms;

import com.teaapp.model.TeaModel;
import java.util.List;

/**
 *
 * @author ronikghale
 */
public class InsertionSort {
     /**
     * Sorts a list of TeaModel objects by their Tea Name in ascending order.
     *
     * @param teaList the list of TeaModel objects to be sorted
     */
    public void sortByTeaName(List<TeaModel> teaList) {
        for (int i = 1; i < teaList.size(); i++) {
            TeaModel key = teaList.get(i);
            String keyName = key.getTeaName();
            int j = i - 1;

            // Move elements of teaList[0..i-1] that are greater than keyName
            // to one position ahead of their current position
            while (j >= 0 && teaList.get(j).getTeaName().compareToIgnoreCase(keyName) > 0) {
                teaList.set(j + 1, teaList.get(j));
                j--;
            }
            teaList.set(j + 1, key);
        }
    }
}
    




