package com.example.shopping.orderdetail;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OrderDetail")
@Getter @Setter
public class OrderDetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderItemSN;

    @Column
    private String OrderID;

    @Column
    private String ProductID;

    @Column
    private int Quantity;

    @Column
    private int StandPrice;

    @Column
    private int ItemPirce;

    public int getOrderItemSN() {
        return OrderItemSN;
    }

    public String getOrderID() {
        return OrderID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setOrderItemSN(int OrderItemSN) {
        this.OrderItemSN = OrderItemSN;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setStandPrice(int standPrice) {
        StandPrice = standPrice;
    }

    public void setItemPirce(int itemPirce) {
        ItemPirce = itemPirce;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getStandPrice() {
        return StandPrice;
    }

    public int getItemPirce() {
        return ItemPirce;
    }
}
