# Project Zero

A getting-started project for CISC 3120, Spring 2017. See the [instructions](http://bc-cisc3120-s17.github.io/project0).

## Description
This program adds two values of type int, double or both from the console and prints their sum. 
```
Enter two numbers: 1001 9
The sum of 1001 and 9 is 18.

Enter two numbers: 10.3 3
The sum of 10.3 and 3 is 13.3.
```

## Extra Credit
Implemented extra-credit portion of assignment.

## Works Cited
[JavaRevisited - How To Check If A Number Is Binary](http://javarevisited.blogspot.com/2014/03/how-to-check-if-number-is-binary-in-java.html#ixzz4aBOD2zz3)
```java
public static boolean isBinary(int number) { 
  int copyOfInput = number;
  while (copyOfInput != 0) { 
    if (copyOfInput % 10 > 1) { 
      return false; 
    } 
    copyOfInput = copyOfInput / 10;
  }
  return true; 
  }
}
```
