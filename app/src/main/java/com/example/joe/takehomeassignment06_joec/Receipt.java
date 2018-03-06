package com.example.joe.takehomeassignment06_joec; /**
 * Created by joe on 3/5/18.
 */
import java.io.Serializable;

public class Receipt implements Serializable {


    private float amount;
    private float tax;
    private float tip;

    public Receipt(float amount, float tax, float tip) {
        this.amount = amount;
        this.tax = tax;
        this.tip = tip;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }
}
