package Solution;

import arraySorter.ArraySort;

public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {

  /***
   * Sort an array
   * @param array the array to be sorted.
   * @return the sorted array
   */
  @Override
  public T[] sort(T[] array) {

    int n = array.length;

    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++) {

      int min_ind = i;
      for (int j = i+1; j < n; j++)
        if (array[j].compareTo(array[min_ind]) < 0)
          min_ind = j;

      // Swap the found minimum element with the first element
      T min = array[min_ind];
      array[min_ind] = array[i];
      array[i] = min;
    }
    return array;
  }
}
