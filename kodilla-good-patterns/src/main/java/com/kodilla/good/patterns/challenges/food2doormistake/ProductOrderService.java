package com.kodilla.good.patterns.challenges.food2doormistake;

import java.util.*;

public class ProductOrderService {
    private SupplierCompanyDatabase supplierCompanyDatabase;
    private ProductDatabase allProductDatabase;

    public ProductOrderService(SupplierCompanyDatabase supplierCompanyDatabase) {
        this.supplierCompanyDatabase = supplierCompanyDatabase;
        this.allProductDatabase = getAllProductDatabaseFromCompanies(supplierCompanyDatabase);
    }

    private ProductDatabase getAllProductDatabaseFromCompanies(SupplierCompanyDatabase supplierCompanyDatabase) {
        Map <String, Product> productMap = new HashMap<>();

        for (Map.Entry<String, SupplierCompany> supplierCompany : supplierCompanyDatabase.getSupplierCompanyMap().entrySet()) {
            for (Map.Entry<String, Product> productEntry : supplierCompany.getValue().getProductDatabase().getProductMap().entrySet()) {
                productMap.put(productEntry.getKey(), productEntry.getValue());
            }
        }

        return new ProductDatabase(productMap);
    }

    public OrderDto orderProcess(OrderRequest orderRequest) {
        if (orderRequest.isOrderPossible(orderRequest, this.allProductDatabase)) {
            sendOrderInformationToSuppliersCompanies(orderRequest.getShoppingList());
            orderRequest.getUser().getInformationService().sendConfirmationMessage(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(),
                    orderRequest.getShoppingList(),
                    true);
        }
        return new OrderDto(orderRequest.getUser(),
                    orderRequest.getShoppingList(),
                    false);
    }

    private void sendOrderInformationToSuppliersCompanies(List<Product> productList) {
        for (Map.Entry<String, SupplierCompany> supplierCompany : supplierCompanyDatabase.getSupplierCompanyMap().entrySet()) {
            for (Product product : productList) {
                Map<String, Product> productMap = supplierCompany.getValue().getProductDatabase().getProductMap();
                if(productMap.containsKey(product.getId()) && productMap.get(product.getId()).getAmount() >= product.getAmount()) {
                    supplierCompany.getValue().getInformationService().sendConfirmationMessage(supplierCompany.getValue());
                }
            }
        }
    }
}
