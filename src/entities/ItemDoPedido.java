package entities;

public class ItemDoPedido {
    private Integer quantity;
    private Double price;

    public ItemDoPedido(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public ItemDoPedido(){
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double subTotal(Integer quantity, Double price){
        return quantity * price;
    }

}
