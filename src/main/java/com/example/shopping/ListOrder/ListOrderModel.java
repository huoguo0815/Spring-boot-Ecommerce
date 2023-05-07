package com.example.shopping.ListOrder;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OrderList")
@Getter @Setter
public class ListOrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String OrderID;

    @Column
    private String MemberID;

    @Column
    private int price;

    @Column
    private String PayStatus;


}
