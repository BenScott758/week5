package Solution;

import arraySorter.ArraySort;

public class InsertionSort<T extends Comparable<? super T>>  implements ArraySort<T> {

  @Override
  public T[] sort(T[] array) {
    for (int i = 1; i < array.length; i++) {
      int currentIndex = i;

      while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
        T temp = array[currentIndex];
        array[currentIndex] = array[currentIndex - 1];
        array[currentIndex - 1] = temp;
        currentIndex--;
      }
    }
    return array;
  }

}
