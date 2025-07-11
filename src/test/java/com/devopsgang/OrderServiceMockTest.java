package com.devopsgang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceMockTest{

  @Test
  void testWithMockDiscount(){
    // Arrange
    DiscountService buster = mock(DiscountService.class);
    when(buster.getRate("SALES10")).thenReturn(0.10);
    OrderService service = new OrderService(buster);

    // Act
    double total = service.getTotal(100,"SALES10", true);
    assertEquals(110.0, total);
  }

}