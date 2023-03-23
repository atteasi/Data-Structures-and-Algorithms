# Answers

- Name: Atte Asikainen	
- Group 8

## Group Activity 1

### Task 1

- Binary search checks the middle index in a sorted array and checks if the searched key is higher or lower than the value of the middle index. If the array is even, the middle point is rounded down. Binary search keeps doing the checks until it finds the palcement of the key.

### task 2

- Binary search does not use the divide-and-conquer technique. Instead of keeping the unused halves in mind, binary search 'discards' the unused halves because they are not used anymore in the algorythm.


### task 3

- insert() finds the spot in the array a value is supposed to go to, and then moves all the elements that come after the value by one.
- -delete() finds the element you want to delete, and then moves all the bigger elements down by one. It also decreases the amount of elements by one. If the value is not found, the method returns false.
-  ```java
	int low = 0;
	int high = nElems -1;
	while(low <= high){
		int mid = (high - low) / 2;
		if(a[mid] == searcKey){
			return mid;
		} else if(a[mid] < searcKey){
			high = mid - 1;
		} else {
			low = mid + 1;
		}
	}
	return -1;


---

## Group Activity 2

### Task 1

- Linear search has three different complexities: Best case, worst case and average case. Best case means the searched key is found with the first operation, worst case means the key is found on the last operation or not at all, and average case means the key is found somewhere inbetween.
- Binary search has the same complexities as Linear Search, and it also has Space Complexity of Binary Search: O(1) for iterative, O(logN) for recursive.

### task 2

- Bubble Sort (as the code is written in this module) is a stable sorting algorithm. Recall that a stable sorting algorithm maintains the relative order of records with equal keys.

Answer: True
- What is the running time of Bubble Sort when the input is an array where all record values are equal?

Answer: Θ(n^2)
-When is Bubble Sort a good choice for sorting an array?

Answer: There is no situation where Bubble Sort is the best choice over all of the others in this chapter

### task 3

```java
	int left = 0;
    int right = nElems - 1;
    int mid = 0;

    while (left <= right) {
        mid = left + (right - left) / 2;

        if (a[mid] == value) {
            break;
        } else if (a[mid] < value) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    int insertIndex = (a[mid] < value) ? mid + 1 : mid;

    for (int k = nElems; k > insertIndex; k--) {
        a[k] = a[k - 1];
    }

    a[insertIndex] = (int) value;
    nElems++;
```

---

## Group Activity 3

### Task 1

- Your task in this exercise is to show the behavior for linked list insertion. You must insert the value 101 to the current position. In the process, you will need to create a new node and move some node values and pointers.

Answer: Create a new node, insert current value to new node, link the current node to the new node and the new node to the next node and then insert new value in the current node.

-Your task in this exercise is to show the behavior for linked list insertion. You must insert the value 405 to the current position. In the process, you will need to create a new node and move some node values and pointers.

Answer: Create a new node, insert current value to new node, link the current node to the new node and the new node to the next node and then insert new value in the current node.

- Your task in this exercise is to show the behavior for linked list insertion. You must insert the value 255 to the current position. In the process, you will need to create a new node and move some node values and pointers.

Answer: Create a new node, insert current value to new node, link the current node to the new node and the new node to the next node and then insert new value in the current node.

### task 2

- Done

### task 3

The remove() method removes the current element in a singly linked list by pulling forward the next element, updating the tail if needed, updating the next pointer, and returning the removed element's value. The method will throw a NoSuchElementException if there's no valid element to remove.
The insert() method inserts a new element at the current position in a singly linked list by creating a new Link object, updating the current element's value and next pointer, adjusting the tail if needed, and incrementing the list size.

---

## Pair Programming 1

### Task 1

- Efficiency, scalability and resource optimization
- The Big O notation is used to describe the growth rate of an algorithm in terms of input size.
- Constant complexity is the most desirable, followed by logarithmic, linear, and finally quadratic complexities.

### task 2

- ```java
	int[] list = {1, 2, 3, 4, 5, 6}
	int square = list[0] * list[0];
	System.out.println(square);
- The complexity is O(1)

### task 3

- ```java
	int[] list = {11, 22, 33, 44, 55, 66};
	for(int i = 0; i < list.length; i++){
		System.out.println(list[i]);
	}
- The complexity is O(n)

### task 4

- Complexity refers to how difficult a problem or algorithm is to solve, while performance refers to how well a system or algorithm executes a given task.
- Complexity affects performance, and performance can also affect complexity.
-  Big O notation tells us how much "work" an algorithm will take as its input gets bigger and bigger.
---

## Pair Programming 2

### Task 1

- 17
- [x] At most, 6.

### task 2

- There are 2 classes: LinkNode and SingleLL. LinkNode only contains a constructor for LinkNodes that are used in the SingleLL, in which the LinkNode object is assigned data and the value of the next node. SingleLL has a constructor that assigns the head as null. The method addNode creates a node based on given data and then connects the current node to the previous head.
There is also a dispaly method to display every node in the SingleLL
- ```java
	public void addNodeToEnd(int data){
		LinkNode node = new LinkNode(data);
		LinkNode current = this.head;
     	while (current.next != null) {
        	current = current.next;
      	}
      	current.next = node;
	}

- ```java
	LinkNode newNode = new LinkNode(data);
    LinkNode current = head;
    int currentPosition = 0;

    head = (position == 0) ? newNode : head;
    newNode.next = (position == 0) ? current : null;

    while (current != null && currentPosition < position - 1) {
      current = current.next;
      currentPosition++;
    }

    // If the current node is not null, insert the new node after the current node
    if (current != null) {
      newNode.next = current.next;
      current.next = newNode;
    }
  

### task 3

- Implementing a sorted linekd list only means you need to modify the addNode method to put the node in the right place. This can be achieved with linear search.

---

## Peer Assessment


### Group members (Including yourself)

- Atte Asikainen 5
- Sebastian Wolf 5
- Juho Ahola 5
- Eveliina Heino 5


- Pair:
	Sebastian Wolf 5
### Other Groups (When applicable)

- ?
- ?
- ?
- ?
- ?

## References (When applicable)

- ?
- ?
