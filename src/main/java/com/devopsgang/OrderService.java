package com.devopsgang;

public class OrderService{
  public double getTotal(double subtotal, boolean hasDiscount, boolean hasExpressShipment){
    if (subtotal < 0) {
        throw new IllegalArgumentException("Subtotal no puede ser negativo");
    }
    
    
    double discount = hasDiscount ? 0.10 : 0;
    double shipment = hasExpressShipment ? 20.0 : 10.0;

    return (subtotal * (1-discount)) + shipment;
  }
}
