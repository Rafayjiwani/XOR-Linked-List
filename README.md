# XOR-Linked-List:
A common Doubly Linked List requires space for two location fields to store the addresses of past and next nodes. A memory efficient of Doubly Linked List can be made utilizing just one space for address field with each node. This memory effective Doubly Linked List is called XOR Linked List or Memory Efficient as the rundown utilizes bitwise XOR activity to spare space for one location. In the XOR connected rundown, rather than putting away real memory addresses, each node stores the XOR of addresses of past and next node.

# Problem In Python:
If using a language that has no pointers (such as Python), you can assume you have access to get_pointer and dereference_pointer functions that converts between nodes and memory addresses which are the functions of C++ or C language

You can't build an XOR linked list in Python, since Python doesn't let you mess with the bits in pointers..
If you're worried about memory, it's almost always better to use a doubly-linked list with more than 1 element per node, like a linked list of arrays.

For example, while an XOR linked list costs 1 pointer per item, plus the item itself, A doubly-linked list with 16 items per node costs 3 pointers for each 16 items, or 3/16 pointers per item. (the extra pointer is the cost of the integer that records how many items are in the node) That is less than 1. In Python there are additional overheads, but it still works out better.

In addition to the memory savings, you get advantages in locality because all 16 items in the node are next to each other in memory. Algorithms that iterate through the list will be faster.

Note that an XOR-linked list also requires you to allocate or free memory each time you add or delete a node, and that is an expensive operation. With the array-linked list, you can do better than this by allowing nodes to be less than completely full. If you allow 5 empty item slots, for example, then you only have allocate or free memory on every 3rd insert or delete at worst.

the code given in this repository of Python For XOR linked List is not running you have to assume it uses pointers and you have access to get_pointer and dereference_pointer functions

# Functions:
1) insert or add
2) print or get

# Instruction:
The user should copy the code in the compilers with respect to thier Programming Languages and run the code by adding values in it 

for C++ Code Direct Execution Click this Link : https://onlinegdb.com/rkHk0Hs-I
for C Code Direct Execution Click this Link : https://onlinegdb.com/Skd818iWU

# Project Members :
1) Abdul Rafay
2) Mustafa Shahid
3) Sikander Shakeel
