# SMKDEV Coding Challenge

This documentation provides information about the NichiCDX console application, which allows users to find prime numbers within a specified range.

Created by            : Rafie Restu Ramadhani
School Origin         : SMKN 4 TANGERANG
Programming Language  : Kotlin

## Table of Contents
- [Get Started]()
- [How To Use]()
- [Errors]()
- [Code Structure]()
- [Program Logic]()
- [`isPrime()` Function]()

## Get Started

This is a console application that allows users to input two numbers, `start` (the starting value) and `end` (the ending value), and then displays all prime numbers within that range.

## How To Use

### 1. Running the Program

This program should be executed in a suitable Kotlin environment (e.g., Kotlin Playground).

### 2. Entering `start` and `end` Values

```bash
// Input Example:

Program to display prime numbers in a range.
Enter the start value: 25
Enter the end value: 50
```

- The program will prompt the user to enter values for start and end.
- Ensure that both start and end are integers greater than 1, and that start is less than end.

### 3. Displaying the Results

```bash
// Example Result:

Program to display prime numbers in a range.
Enter the start value: 25
Enter the end value: 50
Prime numbers between 25 and 50 are:

29
31
37
41
43
47
```

The program will display all prime numbers that fall within the `start` and `end` range.

### 4. Errors

The program will provide error messages and prompt the user to enter valid `start` and `end` values if:

```bash
// Error 1 (The values entered are not valid integers.):

Program to display prime numbers in a range.
Enter the start value: abc

Invalid input. Please enter valid integers for start and end values.

// Error 2 (Either `start` or `end` is less than or equal to 1.):

Enter the start value: 1
Enter the end value: 50

Invalid input. Both start and end values must be greater than 1.

// Error 3 (Either `start` or `end` is less than or equal to 1.):

Enter the start value: 50
Enter the end value: 25

Invalid input. The start value must be less than the end value.
```

| Error Message                                | Meaning                                        |
| ------------------------------------------- | ---------------------------------------------- |
| Invalid input. Please enter valid integers for start and end values. | The values entered are not valid integers.     |
| Invalid input. Both start and end values must be greater than 1. | Either `start` or `end` is less than or equal to 1. |
| Invalid input. The start value must be less than the end value. | `start` is greater than or equal to `end`.     |


