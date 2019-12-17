package arraySorter;

import Solution.InsertionSort;
import Solution.QuickSort;
import Solution.SelectionSort;
import timer.Timer;

public abstract class InsertionSortTimer <T extends Comparable<? super T>> extends InsertionSort<T> implements Timer {

  private T[] array; // this is the array that will be sorted

  void setArray(T[] array) {
    this.array = array;
  }

  @Override
  public Timer getTimer(int size) {
    return null;
  }

  @Override
  public void timedMethod() {
    sort(array);
  }

  @Override
  public long getMaximumRuntime() {return Long.MAX_VALUE;}

  @Override
  public int getMinimumTaskSize() {
    return 1;
  }

  @Override
  public int getMaximumTaskSize(){return 100000;}

  @Override
  public int getRunSetSize() {return 100;}
}