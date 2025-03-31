package org.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {
  @Test
  public void testAdd() {
    assertEquals(12, MathUtil.add(5, 7));
  }

  @Test
  public void testMultiply() {
    assertEquals(35, MathUtil.multiply(5, 7));
  }
}
