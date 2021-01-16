package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class SupplierCompany implements InformationRecipient {
    private String companyName;
    private String companyAddress;
    private String companyId;
    private ProductDatabase productDatabase;
    private InformationService informationService;

    public SupplierCompany(String companyName,
                           String companyAddress,
                           String companyId,
                           ProductDatabase productDatabase,
                           InformationService informationService) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyId = companyId;
        this.productDatabase = productDatabase;
        this.informationService = informationService;
    }

    @Override
    public String toString() {
        return "ID " + companyId +
                ", company " + companyName +
                ", company address " + companyAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierCompany that = (SupplierCompany) o;
        return Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyAddress, that.companyAddress) &&
                Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, companyAddress, companyId, productDatabase, informationService);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public ProductDatabase getProductDatabase() {
        return productDatabase;
    }

    public InformationService getInformationService() {
        return informationService;
    }
}
