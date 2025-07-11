package com.devopsgang;

public class OrderService{
  private DiscountService discountService;
  public OrderService(DiscountService discountService){
    this.discountService = discountService;
  }

  public double getTotal(double subtotal, String discountCode, boolean hasExpressShipment){
    if (subtotal < 0) {
        throw new IllegalArgumentException("Subtotal no puede ser negativo");
    }
    
    
    double discount = discountService.getRate(discountCode);
    double shipment = hasExpressShipment ? 20.0 : 10.0;

    return (subtotal * (1-discount)) + shipment;
  }
}
