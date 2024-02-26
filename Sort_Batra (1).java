import needed.SortingRequirementsBUBBLE;
import needed.SortingRequirementsINSERTION;

import java.util.List;

public class Sort_Batra<T> implements SortingRequirementsINSERTION {
   public <T extends Comparable<T>> T[] insertionSort(T[] array) {
      for(int numSorted = 1; numSorted < array.length; numSorted++)
      {
         for(int current = numSorted; current > 0; current--)
         {
            if(array[current].compareTo(array[current-1]) < 0)
            {
               T temp = array[current];
               array[current] = array[current - 1];
               array[current - 1] = temp;
            }
         }
      }
      return array;
   }

   public <T extends Comparable<T>> List<T> insertionSort(List<T> list) {
      for(int numSorted = 1; numSorted < list.size(); numSorted++)
      {
         for(int current = numSorted; current > 0; current--)
         {
            if((list.get(current)).compareTo(list.get(current - 1)) < 0)
            {
               T temp = list.get(current);
               list.set(current, list.get(current - 1));
               list.set(current - 1, temp);
            }
         }
      }
      return list;
   }

   public <T extends Comparable<T>> T[] insertionSort(T[] array, int numIterations) {
      for(int numSorted = 1; numSorted < numIterations + 1; numSorted++)
      {
         for(int current = numSorted; current > 0; current--)
         {
            if(array[current].compareTo(array[current-1]) < 0)
            {
               T temp = array[current];
               array[current] = array[current - 1];
               array[current - 1] = temp;
            }
         }
      }
      return array;
   }

   public <T extends Comparable<T>> List<T> insertionSort(List<T> list, int numIterations) {
      for(int numSorted = 1; numSorted < numIterations + 1; numSorted++)
      {
         for(int current = numSorted; current > 0; current--)
         {
            if((list.get(current)).compareTo(list.get(current - 1)) < 0)
            {
               T temp = list.get(current);
               list.set(current, list.get(current - 1));
               list.set(current - 1, temp);
            }
         }
      }
      return list;
   }

//   public <T extends Comparable<T>> T[] bubbleSort(T[] array) {
//
//      for(int numSorted = 0; numSorted < array.length-1; numSorted++)
//      {
//         for(int current = array.length - 1; current > numSorted; current--)
//         {
//            if(array[current].compareTo(array[current-1]) < 0)
//            {
//               T temp = array[current];
//               array[current] = array[current - 1];
//               array[current - 1] = temp;
//            }
//         }
//      }
//
//      return array;
//   }
//
//   public <T extends Comparable<T>> List<T> bubbleSort(List<T> list) {
//
//      for(int numSorted = 0; numSorted < list.size()-1; numSorted++)
//      {
//         for(int current = list.size() - 1; current > numSorted; current--)
//         {
//            if((list.get(current)).compareTo(list.get(current-1)) < 0)
//            {
//               T temp = list.get(current);
//               list.set(current, list.get(current - 1));
//               list.set(current - 1, temp);
//            }
//         }
//      }
//      return list;
//   }
//
//   public <T extends Comparable<T>> T[] bubbleSort(T[] array, int numIterations) {
//
//      for(int numSorted = 0; numSorted < numIterations; numSorted++)
//      {
//         for(int current = array.length - 1; current > numSorted; current--)
//         {
//            if(array[current].compareTo(array[current-1]) < 0)
//            {
//               T temp = array[current];
//               array[current] = array[current - 1];
//               array[current - 1] = temp;
//            }
//         }
//      }
//
//      return array;
//   }
//
//   public <T extends Comparable<T>> List<T> bubbleSort(List<T> list, int numIterations) {
//      for(int numSorted = 0; numSorted < numIterations; numSorted++)
//      {
//         for(int current = list.size() - 1; current > numSorted; current--)
//         {
//            if((list.get(current)).compareTo(list.get(current-1)) < 0)
//            {
//               T temp = list.get(current);
//               list.set(current, list.get(current - 1));
//               list.set(current - 1, temp);
//            }
//         }
//      }
//      return list;
//   }
}
