package com.corndel.hackulator;
import java.util.Arrays;
public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {
    
    

    if (x==y && x==z){
      return x;
    }
    if (x > y && x > z) {
      return x;
    }

    if (y > z && y > x) {
      return y;
    }

    if (z > x && z > y) {
      return z;
    } else  {
      int [] numberList ={x,y,z};
      Arrays.sort(numberList);
      return numberList[2];
    }

    // throw new Error("Is this reachable?");
  }
}
