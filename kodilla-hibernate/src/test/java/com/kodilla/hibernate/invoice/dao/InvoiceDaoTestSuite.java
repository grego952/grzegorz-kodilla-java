package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product = new Product("Computer Mouse");
        Product product1 = new Product("Keyboard");
        Product product2 = new Product("Processor");
        Item item = new Item(product, new BigDecimal(20), 5, new BigDecimal(100));
        Item item1 = new Item(product1, new BigDecimal(50), 4, new BigDecimal(200));
        Item item2 = new Item(product2, new BigDecimal(350), 1, new BigDecimal(150));

        Invoice invoice = new Invoice("001");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();


        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
