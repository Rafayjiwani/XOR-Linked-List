/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

/* C++ Implementation of Memory 
efficient Doubly Linked List */
//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
//#include <bits/stdc++.h>

// Node structure of a memory 
// efficient doubly linked list 
public class Node
{
	public int data;
	public Node npx; // XOR of next and previous node
}

package <missing>;

public class GlobalMembers
{
	/* returns XORed value of the node addresses */
	public static Node XOR(Node a, Node b)
	{
		return (Node)((short)(a) ^ (short)(b));
	}

	/* Insert a node at the beginning of the 
	XORed linked list and makes the newly 
	inserted node as head */
	public static void insert(Node[] head_ref, int data)
	{
		// Allocate memory for new node 
		Node new_node = new Node();
		new_node.data = data;

		/* Since new node is being inserted at the 
		beginning, npx of new node will always be 
		XOR of current head and NULL */
		new_node.npx = XOR(head_ref[0], null);

		/* If linked list is not empty, then npx of 
		current head node will be XOR of new node 
		and node next to current head */
		if (head_ref[0] != null)
		{
			// *(head_ref)->npx is XOR of NULL and next. 
			// So if we do XOR of it with NULL, we get next 
			Node next = XOR(head_ref.npx, null);
			head_ref.npx = XOR(new_node, next);
		}

		// Change head 
		head_ref[0] = new_node;
	}

	// prints contents of doubly linked 
	// list in forward direction 
	public static void printList(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node next;

		System.out.print("Following are the nodes of Linked List: \n");

		while (curr != null)
		{
			// print current node 
			System.out.print(curr.data);
			System.out.print(" ");

			// get address of next node: curr->npx is 
			// next^prev, so curr->npx^prev will be 
			// next^prev^prev which is next 
			next = XOR(prev, curr.npx);

			// update prev and curr for next iteration 
			prev = curr;
			curr = next;
		}
	}

	// Driver code 
	public static int Main()
	{
		/* Create following Doubly Linked List 
		head-->40<-->30<-->20<-->10 */
		Node head = null;
		insert(head, 10);
		insert(head, 20);
		insert(head, 30);
		insert(head, 40);

		// print the created list 
		printList(head);

		return (0);
	}

	// This code is contributed by rathbhupendra 


}