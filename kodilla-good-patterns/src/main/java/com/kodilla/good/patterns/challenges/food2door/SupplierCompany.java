package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class SupplierCompany implements Recipient {
    private String companyName;
    private String companyAddress;
    private String companyID;
    private ProductDatabase productDatabase;
    private InformationService informationService;

    public SupplierCompany(String companyName,
                           String companyAddress,
                           String companyID,
                           ProductDatabase productDatabase,
                           InformationService informationService) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyID = companyID;
        this.productDatabase = productDatabase;
        this.informationService = informationService;
    }

    @Override
    public void getConfirmationOfOrder(CheckOrder checkOrder, ProductDatabase productDatabase, OrderRequest orderRequest) {
        if (checkOrder.isOrderPossible(productDatabase,orderRequest)) {
            informationService.sendConfirmationMessageToRecipient(this);
            System.out.println("The order is send to supplier");
        } else {
            System.out.println("The order cannot be realised");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyID() {
        return companyID;
    }

    public ProductDatabase getProductDatabase() {
        return productDatabase;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierCompany that = (SupplierCompany) o;
        return Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyAddress, that.companyAddress) &&
                Objects.equals(companyID, that.companyID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, companyAddress, companyID, productDatabase, informationService);
    }

    @Override
    public String toString() {
        return  "Nme of company: " + companyName +
                "\n company address: " + companyAddress +
                "\n companyID: " + companyID;
    }
}
