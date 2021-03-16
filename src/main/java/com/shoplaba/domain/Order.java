package com.shoplaba.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany (fetch = FetchType.EAGER)
    @JoinColumn (name = "ordered_items_id")
    private Integer orderedItemsId;
    private Integer itemsQty;
    private Date dateOfOrder;


    public Order() {
    }
    public Order(Integer orderedItemsId, Integer itemsQty, Date dateOfOrder) {
        this.orderedItemsId=orderedItemsId;
        this.itemsQty=itemsQty;
        this.dateOfOrder=dateOfOrder;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderedItemsId() {
        return orderedItemsId;
    }

    public void setOrderedItemsId(Integer orderedItemsId) {
        this.orderedItemsId = orderedItemsId;
    }

    public Integer getItemsQty() {
        return itemsQty;
    }

    public void setItemsQty(Integer itemsQty) {
        this.itemsQty = itemsQty;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
