# Linked-List

This repository contains an implementation of a singly linked list in Java. The SinglyLL class provides methods to perform common operations on a linked list such as adding elements to the beginning or end, removing elements from the beginning or end, and printing the list.

Class Structure
Node Class

Fields:
int data: Stores the data of the node.
Node next: Pointer to the next node in the list.
Constructor: Initializes the node with the given data and sets the next pointer to null.

SinglyLL Class

Fields:
Node head: Static head of the list, initially set to null.

Methods:
void AddFirst(int data): Adds a new node with the given data at the beginning of the list.
void AddLast(int data): Adds a new node with the given data at the end of the list.
void removeFirst(): Removes the first node of the list.
void removeLast(): Removes the last node of the list.
void Print(): Prints all the elements of the list.

Usage
The main method demonstrates the usage of the SinglyLL class by performing the following operations:

Adding elements to the beginning and end of the list.
Printing the list.
Removing elements from the beginning and end of the list.
Printing the list after each removal operation.

How to Run
1. Clone the repository.
2. Compile the SinglyLL.java file.
3. Run the SinglyLL class to see the operations in action.
