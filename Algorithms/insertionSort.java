//this was actually in one of our lessons.
//if there is something wrong tell me.

class InsertionSort{
 static void InsertionSort(int arr[]){
   int j;
   for (int i=1; i<arr.length; i++){
    j = 1;
     while (j > 0 && arr[j-1] > arr[j]){
      int temp = arr[j];
       arr[j] = arr[j-1];
       arr[j-1] = temp;
       j--
     }
     
   }
   
 }
}
