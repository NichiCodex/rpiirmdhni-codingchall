# SMKDEV Coding Challenge

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

## Errors

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

## Code Structure

| Function                   | Description                                                                                              |
| -------------------------- | -------------------------------------------------------------------------------------------------------- |
| `main()`                   | The main function that controls the program flow. It prompts the user to input `start` and `end` values, checks the input's validity, and displays prime numbers within the specified range. |
| `readInt(prompt: String): Int?` | A helper function that reads user input and returns an `Int` value if the input is valid or `null` if it's not. |
| `isPrime(n: Int): Boolean` | A function that checks whether a number `n` is prime or not.                                            |

## `isPrime()` Function

The `isPrime()` function checks whether a given integer `n` is a prime number or not. Here's how it works:

- If `n` is less than or equal to 1, the function returns `false` because prime numbers must be greater than 1.
- If `n` is 2 or 3, the function returns `true` since 2 and 3 are prime numbers.
- If `n` is divisible by 2 or 3, the function returns `false`, as divisible numbers are not prime.
- The function employs a more efficient algorithm to check for prime numbers. It iterates from 5 to the square root of `n` with a step of 6.
- During this iteration, if `n` is divisible by any number in this range, the function returns `false`.
- If `n` is not divisible by any number in the specified range, it is considered a prime number, and the function returns `true`.
