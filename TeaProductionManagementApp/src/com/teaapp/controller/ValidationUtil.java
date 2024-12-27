package com.teaapp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern TEA_ID_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern TEA_NAME_PATTERN = Pattern.compile("^[A-Za-z ]{1,50}$");
    private static final Pattern PRICE_PER_KG_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    private static final Pattern HARVESTING_LOCATION_PATTERN = Pattern.compile("^[A-Za-z0-9 ,]{1,100}$");
    private static final Pattern TEA_TYPE_PATTERN = Pattern.compile("^(Black|Green|White|Oolong|Herbal)$");
    private static final Pattern QUALITY_PATTERN = Pattern.compile("^(Premium|Standard|Economy)$");
    private static final Pattern EXPORT_STATUS_PATTERN = Pattern.compile("^(Yes|No)$");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the tea ID is a positive integer.
     *
     * @param teaId the tea ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTeaId(String teaId) {
        return !isNullOrEmpty(teaId) && TEA_ID_PATTERN.matcher(teaId.trim()).matches();
    }

    /**
     * Validates if the tea name contains only letters and spaces.
     *
     * @param teaName the tea name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTeaName(String teaName) {
        return !isNullOrEmpty(teaName) && TEA_NAME_PATTERN.matcher(teaName.trim()).matches();
    }

    /**
     * Validates if the price per kilogram is a valid positive number.
     *
     * @param pricePerKg the price per kilogram to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPricePerKg(String pricePerKg) {
        return !isNullOrEmpty(pricePerKg) && PRICE_PER_KG_PATTERN.matcher(pricePerKg.trim()).matches();
    }

    /**
     * Validates if the harvesting location is between 1 to 100 characters.
     *
     * @param location the harvesting location to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidHarvestingLocation(String location) {
        return !isNullOrEmpty(location) && HARVESTING_LOCATION_PATTERN.matcher(location.trim()).matches();
    }

    /**
     * Validates if the tea type is one of the allowed types.
     *
     * @param teaType the tea type to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTeaType(String teaType) {
        return !isNullOrEmpty(teaType) && TEA_TYPE_PATTERN.matcher(teaType.trim()).matches();
    }

    /**
     * Validates if the quality is one of the allowed options.
     *
     * @param quality the quality to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidQuality(String quality) {
        return !isNullOrEmpty(quality) && QUALITY_PATTERN.matcher(quality.trim()).matches();
    }

    /**
     * Validates if the harvested date is in the format yyyy-MM-dd.
     *
     * @param harvestedDate the harvested date to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidHarvestedDate(String harvestedDate) {
        if (isNullOrEmpty(harvestedDate)) {
            return false;
        }
        try {
            LocalDate.parse(harvestedDate.trim(), DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    /**
     * Validates if the export status is either "Yes" or "No".
     *
     * @param exportStatus the export status to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidExportStatus(String exportStatus) {
        return !isNullOrEmpty(exportStatus) && EXPORT_STATUS_PATTERN.matcher(exportStatus.trim()).matches();
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
}
