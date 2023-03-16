# Pair Programming 2

> Please write the answer to all in-class activities in one file ONLY: `/Answer/README.md`

## Task 1

- Refer to the following link. Discuss how linear search works:
  https://www.cs.usfca.edu/~galles/visualization/Search.html

## Task 2

Discuss how the code in `./src/Main.java` works

## Task 3

1. Where is linear searching used?
   a) When the list has only a few elements
   b) When performing a single search in an unordered list
   c) Used all the time
   d) When the list has only a few elements and When performing a single search in an unordered list

2. Select the code snippet which performs unordered linear search iteratively?

a)

```java
int unorderedLinearSearch(int arr[], int size, int data)
{
    int index;
    for(int i = 0; i < size; i++)
    {
        if(arr[i] == data)
        {
            index = i;
            break;
        }
    }
    return index;
}
```

b)

```java
int unorderedLinearSearch(int arr[], int size, int data)
{
    int index;
    for(int i = 0; i < size; i++)
    {
        if(arr[i] == data)
        {
            break;
        }
    }
    return index;
}
```

c)

```java
int unorderedLinearSearch(int arr[], int size, int data)
{
    int index;
    for(int i = 0; i <= size; i++)
    {
        if(arr[i] == data)
        {
            index = i;
            break;
        }
    }
    return index;
}
```

d)

```java
int unorderedLinearSearch(int arr[], int size, int data)
{
    int index;
    for(int i = 0; i < size-1; i++)
    {
        if(arr[i] == data)
        {
            index = i;
            break;
        }
    }
    return index;
}
```

3. Select the code snippet which performs ordered linear search iteratively?

a)

```java
public int linearSearch(int arr[],int key,int size)
{
       int index = -1;
	   int i = 0;
       while(size > 0)
       {
             if(data[i] == key)
             {
		  index = i;
             }
             if(data[i] > key))
             {
		 index = i;
                 break;
             }
             i++;
       }
       return index;
}
```

b)

```java
public int linearSearch(int arr[],int key,int size)
{
       int index = -1;
	   int i = 0;
       while(size > 0)
       {
             if(data[i] == key)
             {
		  index = i;
             }
             if(data[i] > key))
             {
                  break;
             }
             i++;
       }
       return index;
}
```

c)

```java
public int linearSearch(int arr[],int key,int size)
{
       int index = -1;
	   int i = 0;
       while(size > 0)
       {
             if(data[i] == key)
             {
		break;
             }
             if(data[i] > key))
             {
                 index = i;
             }
             i++;
        }
        return index;
}
```

d)

```java
public int linearSearch(int arr[],int key,int size)
{
       int index = -1;
	   int i = 0;
       while(size > 0)
       {
             if(data[i] == key)
             {
		break;
             }
             if(data[i] > key))
             {
                 break;
                 index=i;
             }
             i++;
        }
        return index;
}
```

4. What does the following piece of code do?

```java
for (int i = 0; i < arr.length-1; i++)
{
for (int j = i+1; j < arr.length; j++)
{
if( (arr[i].equals(arr[j])) && (i != j) )
{
System.out.println(arr[i]);
}
}
}
```

a) Print the duplicate elements in the array
b) Print the element with maximum frequency
c) Print the unique elements in the array
d) Prints the element with minimum frequnecy

## Links

1. https://techiedelight.com/compiler/
2. https://www.softwaretestinghelp.com/searching-algorithms-in-cpp/