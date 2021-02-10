package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");

        Item item1 = new Item(BigDecimal.valueOf(1), 10, BigDecimal.valueOf(10));
        Item item2 = new Item(BigDecimal.valueOf(10), 8, BigDecimal.valueOf(80));
        Item item3 = new Item(BigDecimal.valueOf(100), 5, BigDecimal.valueOf(500));

        Invoice invoice = new Invoice("21/02/0001");

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}