class sortedArray {
  private long[] a; // ref to array a
  private int nElems; // number of data items
  
  public sortedArray(int max) // constructor
  {
    a = new long[max]; // create array
    nElems = 0;
  }
 
  public int size() {
    return nElems;
  }
  
public int find(long searchKey) { // find specified value
  int j;
  for (j = 0; j < nElems; j++) // for each element,
    if (a[j] == searchKey) // found item?
      break; // exit loop before end
  if (j == nElems) // gone to end?
    return nElems; // yes, can’t find it
  else
    return j; // no, found it
}

  public void insert(long value) // put element into array
  {
    int j;
    for (j = 0; j < nElems; j++) // find where it goes
      if (a[j] > value) // (linear search)
        break;
    for (int k = nElems; k > j; k--) // move bigger ones up
      a[k] = a[k - 1];
    a[j] = value; // insert it
    nElems++; // increment size
  } 
  
  public boolean delete(long value) {
    int j = find(value);
    if (j == nElems) // can't find it
      return false;
    else // found it
    {
      for (int k = j; k < nElems; k++) // move bigger ones down
        a[k] = a[k + 1];
      nElems--; // decrement size
      return true;
    }
  } 

  public void display() // displays array contents
  {
    for (int j = 0; j < nElems; j++) // for each element,
      System.out.print(a[j] + " "); // display it
    System.out.println("");
  }
 
} 
// end class sortedArray

class Main {
  public static void main(String[] args) {
    int maxSize = 100; // array size
    sortedArray arr; // reference to array

    arr = new sortedArray(maxSize); // create the array
    arr.insert(77); // insert 10 items
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    int searchKey = 11; // search for item
    if (arr.find(searchKey) != arr.size())
      System.out.println("Found " + searchKey);
    else
      System.out.println("Can't find " + searchKey);
    arr.display(); // display items
    arr.delete(00); // delete 3 items
    arr.delete(55);
    arr.delete(99);
    arr.display(); // display items again

  } 
} 