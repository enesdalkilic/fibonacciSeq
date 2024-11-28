# Fibonacci Sequence Generator

## Overview

This program generates the Fibonacci sequence up to a specified position in the sequence. The user is prompted to input a sequence number, and the program calculates the Fibonacci number at that position.

## Program Flow

1. **User Input**: The program asks the user for a sequence number to stop at.
2. **Input Validation**: The program ensures that the user enters a valid number. If the input is not a number, it prompts the user to enter a valid number.
3. **Fibonacci Calculation**: The program calculates the Fibonacci number at the specified sequence index using an iterative approach.
4. **Output**: The program prints the Fibonacci number at the specified position.

## Class: `FibonacciSequence`

The `FibonacciSequence` class contains methods for calculating Fibonacci numbers.

### Methods

#### `public static void main(String[] args)`

The main entry point of the program. It handles the user input, validates it, and prints the Fibonacci number at the desired sequence.

- **Steps**:
  1. Prompts the user to enter a sequence number.
  2. Validates the input to ensure it is a valid integer.
  3. Calls `fibonacciSeq(int seq)` to compute the Fibonacci number at the specified position.
  4. Prints the result.

#### `public static double fibonacciSeq(int seq)`

This method calculates the Fibonacci number at the specified sequence position using an iterative approach.

- **Parameters**:
  - `seq`: The position in the Fibonacci sequence (zero-indexed).
  
- **Returns**: The Fibonacci number at the specified sequence index.
  
- **Algorithm**:
  1. The method starts with `num1 = 0` and `num2 = 1`.
  2. It iterates through the sequence, updating the values of `num1` and `num2` until it reaches the specified sequence index.
  3. The final value of `num3` is the Fibonacci number at the given index.

## Example Usage

