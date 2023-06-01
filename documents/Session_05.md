# Strings, Arrays, ArrayLists, Dates, and Lambdas
## Overview
- Create and Manipulate Strings
- Manipulate Data Using the StringBuilder Class and Its Methods
- Create and Use Calendar Data
- Declare, Instantiate, Initialize, and Use a One-Dimensional Array
- Declare, Instantiate, Initialize, and Use a Multidimensional Array
- Declare and Use an ArrayList
- Use Wrapper Classes
- Use Encapsulation for Reference Variables
- Use Simple Lambda Expressions

### String
```java
String s = new String();
s = "abcdef";
x.concat("Rules");
```

- **charAt()** Returns the character located at the specified index
```java
	String x = "airplane";
```
- **concat() Appends one string to the end of another (+ also works)
- **equalsIgnoreCase() Determines the equality of two strings, ignoring case
- **length() Returns the number of characters in a string
- **replace() Replaces occurrences of a character with a new character
- **substring() Returns a part of a string
- **toLowerCase() Returns a string, with uppercase characters converted to lowercase
- **toString() Returns the value of a string
- **toUpperCase() Returns a string, with lowercase characters converted to uppercase
- **trim() Removes whitespace from both ends of a strings

### Manipulate Data Using the StringBuilder Class and Its Methods
``` java

```

### ArrayList
Important Methods:
- **add(element)** Adds this element to the end of the ArrayList
- **add(index, element)** Adds this element at the index point and shifts the remaining elements back (for example, what was at index is now at index + 1)
- **clear()** Removes all the elements from the ArrayList
- **boolean contains(element)** Returns whether the element is in the list
- **Object get(index) Returns the Object located at index
- **int indexOf(Object)** Returns the (int) location of the element or -1 if the Object is not found
- **remove(index)** Removes the element at that index and shifts later elements toward the beginning one space
- **remove(Object)** Removes the first occurrence of the Object and shifts later elements toward the beginning one space
- **int size()** Returns the number of elements in the ArrayList

