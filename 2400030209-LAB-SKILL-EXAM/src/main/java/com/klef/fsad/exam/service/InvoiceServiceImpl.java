package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public String addInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
        return "Invoice Added Successfully";
    }

    @Override
    public List<Invoice> viewAllInvoices() {
        return invoiceRepository.findAll();
    }
}