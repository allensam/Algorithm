import java.util.List;
import java.util.ArrayList;
class Max  {
  // public final static int MAX_NUMBERS = 5;
  // public int minNumber = 0;
  public static void main(String[] args) {
    // Max maxObject = new Max();
    // Max anotherMax = new Max();
    int[] cards = {7,8,4,3,4,11};
    minArray(cards);
    fast(3, cards);
  }
  public static void minArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int k = i+1; k < array.length; k++) {
        if (array[k] > array[minIndex]) {
          minIndex = k;
        }
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }
  public static boolean fast(int n, int[] cards) {
    boolean isTrue = false;
    if (n < 7) {
      for (int i = 0; i < 7; i++) {
        if (n == i) {
          isTrue = true;
        }
      }
    }
    if (n > 6) {
      for (int i = 6; i < array.length; i++) {
        if (n == i) {
          isTrue = true;
        }
      }
    }
    return isTrue
  }

  // public void howToUseOther()
  // {
  //   List<Integer> listTest= new ArrayList<>();
  //   listTest.add(1);
  //   listTest.add(2);
  //
  //
  // }
   //int arrex[] = new int[3];
}
