package ex5;

import java.util.ArrayList;

public class InvoiceManager implements Manage<Invoice>{
    public ArrayList <Invoice> Invoices;

    public InvoiceManager() {
        Invoices = new ArrayList<>();
    }

    @Override
    public void add(Invoice item) {
        Invoices.add(item);
    }

    @Override
    public void update(int index, Invoice item) {
        if(index >= 0 && index < Invoices.size()) Invoices.set(index, item);
    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index < Invoices.size()) Invoices.remove(index);
    }

    @Override
    public void display() {
        for(Invoice i : Invoices) System.out.println(i);
    }
}
