package com.driver;

public class Main {
  public static class Product{
    public int product(int x, int y) {
      return x+y;
    }
    public int product(int x, int y, int z) {
      return x+y+z;
    }
    public double product(double x, double y) {
      return x+y;
    }
  }
  public static void main(String[] args){
    Product p = new Product();
    int result = p.product(10,20);
    int result1 = p.product(10,20,30);
    double result2 = p.product(10.0,20.0);

    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
  }
}
