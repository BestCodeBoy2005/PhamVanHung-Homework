package com.mycompany.app;

// Factorial n!=n(n-1)(n-2)...x3x2x1
public class Recursion {
  int num;

  // Constructor
  Recursion() {
  } // default constructor- remember ; before }

  Recursion(int number) {
    this.num = number;
  } // constructor for int

  public int Recursion2(int n) {
    this.num = n;
    if (this.num <= 1) // base case
      return 1;
    else
      return this.num * Recursion2(this.num - 1);
  }

}
