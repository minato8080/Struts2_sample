package model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author A-pZ
 *
 */
@Data
public class SampleProduct implements Serializable {
    public SampleProduct(String id, String name, long stock, boolean secret, boolean editable,int price) {
        super();
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.secret = secret;
        this.editable = editable;
        this.price = price;
    }
    
    private String id;
    private String name;
    private long stock;
    private boolean secret;
    private boolean editable;
    private int price;
}
