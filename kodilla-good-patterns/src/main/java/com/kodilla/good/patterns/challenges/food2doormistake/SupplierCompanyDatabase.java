package com.kodilla.good.patterns.challenges.food2doormistake;

import java.util.*;

public class SupplierCompanyDatabase {
    private Map<String, SupplierCompany> supplierCompanyMap;

    public SupplierCompanyDatabase(Map<String, SupplierCompany> supplierCompanyMap) {
        this.supplierCompanyMap = supplierCompanyMap;
    }

    public Map<String, SupplierCompany> getSupplierCompanyMap() {
        return supplierCompanyMap;
    }

    public void addSupplierCompanyToDatabase (SupplierCompany company) {
        this.supplierCompanyMap.put(company.getCompanyId(), company);
    }
}
