package com.example.my_jewelry;

import android.support.v7.app.AppCompatActivity;

public class OrderJewel extends AppCompatActivity {
    private String typeJewel;
    private String material;
    private String rock;
    private Double totalOrder;
    private String id;

    public OrderJewel(String id, String typeJewel, String material, String rock, Double totalOrder) {
        this.typeJewel = typeJewel;
        this.material = material;
        this.rock = rock;
        this.totalOrder = totalOrder;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeJewel() {
        return typeJewel;
    }

    public void setTypeJewel(String typeJewel) {
        this.typeJewel = typeJewel;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRock() {
        return rock;
    }

    public void setRock(String rock) {
        this.rock = rock;
    }

    public Double getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Double totalOrder) {
        this.totalOrder = totalOrder;
    }

    public void saveOrder(){
        Data.save(this);
    }
}
