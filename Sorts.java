public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int times=0;times<data.length-1;times++){
      for (int i=0;i<data.length-times-1;i++){
        if (data[i]>data[i+1]){
          int a=data[i];
          data[i]=data[i+1];
          data[i+1]=a;
        }
      }
    }
  }
}
