package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorCompany {
    private SupplierCompanyDatabase supplierCompanyDatabase;
    private ProductDatabase productDatabase;

    public Food2DoorCompany(SupplierCompanyDatabase supplierCompanyDatabase) {
        this.supplierCompanyDatabase = supplierCompanyDatabase;
        this.productDatabase = supplierCompanyDatabase.getDatabase();
    }

    public SupplierCompanyDatabase getSupplierCompanyDatabase() {
        return supplierCompanyDatabase;
    }

    public ProductDatabase getProductDatabase() {
        return productDatabase;
    }
}
