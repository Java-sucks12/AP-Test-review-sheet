//again this was in one of our lessons.
//They will most likely ask you to do this on an array but if they ask about a data structure pass it to an array, sort than convert back.
//this is something you just copy and paste.


class SelectionSort {
  static void SelectionSort(int arr[]){
    for (int k=0; k < arr.length-1; k++){
     int min = k;
      for (int j = k+1; j < arr.length; j++){
        if (arr[j] < arr[min]){
          min = j;
        }
        int temp = arr[min];
        arr[min] = arr[k];
        arr[k] = temp;
        
      }
    }
  }
  
}
