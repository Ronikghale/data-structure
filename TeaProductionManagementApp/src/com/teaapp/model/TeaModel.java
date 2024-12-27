package com.teaapp.model;

import java.time.LocalDate;

/**
 *
 * @author Prithivi
 */
public class TeaModel {
    private int teaId;
    private String teaName;
    private double pricePerKg;
    private String harvestingLocation;
    private String teaType;
    private String quality;
    private LocalDate harvestedDate; // New field for harvested date
    private String exportStatus;    // New field for export status

    // Default Constructor
    public TeaModel() {
    }

    // Parameterized Constructor
    public TeaModel(int teaId, String teaName, double pricePerKg, String harvestingLocation,
                    String teaType, String quality, LocalDate harvestedDate, String exportStatus) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.pricePerKg = pricePerKg;
        this.harvestingLocation = harvestingLocation;
        this.teaType = teaType;
        this.quality = quality;
        this.harvestedDate = harvestedDate;
        this.exportStatus = exportStatus;
    }

    // Getters and Setters
    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getHarvestingLocation() {
        return harvestingLocation;
    }

    public void setHarvestingLocation(String harvestingLocation) {
        this.harvestingLocation = harvestingLocation;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public LocalDate getHarvestedDate() {
        return harvestedDate;
    }

    public void setHarvestedDate(LocalDate harvestedDate) {
        this.harvestedDate = harvestedDate;
    }

    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    // Override toString for better object representation
    @Override
    public String toString() {
        return "TeaModel{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", pricePerKg=" + pricePerKg +
                ", harvestingLocation='" + harvestingLocation + '\'' +
                ", teaType='" + teaType + '\'' +
                ", quality='" + quality + '\'' +
                ", harvestedDate=" + harvestedDate +
                ", exportStatus='" + exportStatus + '\'' +
                '}';
    }
}
