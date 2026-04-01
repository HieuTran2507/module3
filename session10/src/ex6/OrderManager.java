package ex6;

import java.util.ArrayList;

public class OrderManager implements Manage<Order>{
    public ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    @Override
    public void add(Order item) {
        orders.add(item);
    }

    @Override
    public void update(int index, Order item) {
        if(index >= 0 && index < orders.size()) orders.set(index,item);
    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index < orders.size()) orders.remove(index);
    }

    @Override
    public void display() {
        for (Order o : orders) System.out.println(o);
    }
}
