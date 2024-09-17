package com.corndel.hackulator;

public class Heron {

  /**
   * Uses Heron's formula to calculate the area of a triangle with sides of length a, b, c
   * https://en.wikipedia.org/wiki/Heron%27s_formula
   */
  static double heron(double a, double b, double c) {
   double semiPerimeter= (a+b+c)/2;
    double areaSquared= (semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
    double area = Math.sqrt(areaSquared);
    return area;

  }
}
