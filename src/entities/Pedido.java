package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private LocalDate moment = LocalDate.now();
    private OrderStatus status;
    List<ItemDoPedido> items = new ArrayList<>();


    public Pedido(LocalDate moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<ItemDoPedido> getItems() {
        return items;
    }

    public void addItem(ItemDoPedido item){
        items.add(item);
    }

    public void removeItem(ItemDoPedido item){
        items.remove(item);
    }
}
