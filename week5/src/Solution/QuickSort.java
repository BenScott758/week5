package Solution;

/***
 *  QuickSort Implementation
 *
 * @author Ben Scott
 * @version December 2019
 */
import arraySorter.ArraySort;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {
    /***
     * Sort array
     *
     * @param array the array to be sorted.
     * @return the sorted array
     */
  @Override
  public T[] sort(T[] array) {
    return quickSort(array, 0, array.length - 1);
  }

  public T[] quickSort(T[] array, int left, int right){
    if (array == null || array.length == 0)
      return array;

    if (left >= right)
      return array;

    // pick the pivot
    int middle = left + (right - left) / 2;
    T pivot = array[middle];

    // make left < pivot and right > pivot
    int i = left, j = right;
    while (i <= j) {
      while (array[i].compareTo(pivot) < 0) {
        i++;
      }

      while (array[j].compareTo(pivot) > 0) {
        j--;
      }

      if (i <= j) {
        T min = array[i];
        array[i] = array[j];
        array[j] = min;
        i++;
        j--;
      }
    }

    // recursively sort two sub parts
    if (left < j)
      quickSort(array, left, j);

    if (right > i)
      quickSort(array, i, right);

    return array;
  }
}
