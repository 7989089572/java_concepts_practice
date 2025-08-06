# Java Concepts Practice

This repository contains Java examples and explanations for the following topics:

- Pass-by-Value in Java
- Pass-by-Reference (conceptual understanding)
- Global and Local Variables

---

## 📌 1. Pass-by-Value in Java

### ✅ Theory:
In Java, **all arguments are passed by value**, meaning a copy of the variable is passed. For **primitive types**, the actual value is copied. For **objects**, the reference (address) is copied, but not the actual object.

So when you modify the parameter inside a method:
- Primitives: Changes don't affect the original variable.
- Objects: The object's contents can be changed, but reassigning the reference doesn't affect the original.

### ✅ Example:

```java
public class PassByValue {
    public static void main(String[] args) {
        int num = 10;
        modify(num);
        System.out.println("After modify: " + num);  // Output: 10
    }

    static void modify(int x) {
        x = x + 5;
        System.out.println("Inside modify: " + x);  // Output: 15
    }
}
