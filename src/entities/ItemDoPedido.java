package entities;

public class ItemDoPedido {
    private Integer quantity;
    private Double price;
    private Product product = new Product();

    public ItemDoPedido(String nome, Double priceProd, Integer quantity) {
        setProduct(nome);
        setPriceProd(priceProd);
        this.quantity = quantity;
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

    public static Double subTotal(Integer quantity, Double price){
        return quantity * price;
    }

    public String getProductNome() {
        return product.getNome();
    }

    public void setProduct(String product) {
        this.product.setNome(product);
    }

    public Double getPriceProd(){
        return product.getPrice();
    }

    public void setPriceProd(Double price) {
        this.product.setPrice(price);
    }

    @Override
    public String toString() {
        return getProductNome()
                + ", $"
                + String.format("%.2f", getPriceProd())
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal(quantity, getPriceProd()));
    }

}
