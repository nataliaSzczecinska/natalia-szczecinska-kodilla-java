package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;
import java.util.Map;

public class SupplierCompanyDatabase {
    private Map<String, SupplierCompany> supplierCompanies;

    public SupplierCompanyDatabase(Map<String, SupplierCompany> supplierCompanies) {
        this.supplierCompanies = supplierCompanies;
    }

    public ProductDatabase getDatabase() {
        Map<String, Product> productHashMap = new HashMap<>();

        for(Map.Entry<String, SupplierCompany> supplierCompanyEntry:
                supplierCompanies.entrySet()) {
            Map<String, Product> supplierCompanyProductMap =
                    supplierCompanyEntry.getValue().getProductDatabase().getProductList();
            for (Map.Entry<String, Product> productEntry:
                    supplierCompanyProductMap.entrySet()) {
                productHashMap.put(productEntry.getKey(), productEntry.getValue());
            }
        }

        return new ProductDatabase(productHashMap);
    }

}
