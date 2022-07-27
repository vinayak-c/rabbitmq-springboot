package com.vinayak.rabbitmqspringboot.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int qty;
    private double price;

}
