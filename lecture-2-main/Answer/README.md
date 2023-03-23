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
```

---

## Group Activity 2

### Task 1

- ?
- ?

### task 2

- ?
- ?

### task 3

- ?
- ?

---

## Group Activity 3

### Task 1

- ?
- ?

### task 2

- ?
- ?

### task 3

- ?
- ?

---

## Pair Programming 1

### Task 1

- ?
- ?

### task 2

- ?
- ?

### task 3

- ?
- ?

---

## Pair Programming 2

### Task 1

- ?
- ?

### task 2

- ?
- ?

### task 3

- ?
- ?

---

## Peer Assessment

### Group members (Including yourself)

- ?
- ?
- ?
- ?
- ?

### Other Groups (When applicable)

- ?
- ?
- ?
- ?
- ?

## References (When applicable)

- ?
- ?
