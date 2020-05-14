//creating an array list
//make sure you import all
import java.util.*;

ArrayList<Integer> arr = new ArrayList<Integer>();

//adding 10 numbers to arr

for (int i=0; i<10; i++){
 arr.add(i); 
}

//getting first value in array list
System.out.println(arr.get(0));

//adding at specific point in array
// (x, y) where x is the position in array and y is what you want to add.
arr.add(4, 235);

//removing from list
//removes the fifth value, not the actual number 4. 
arr.remove(4);

//finding size
arr.size();


//checking if two arrayLists are equal. I know it is alot but you could copy and paste this honestly.
public static boolean equals(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        if (array1.size() != array2.size()){
            return false;
        }
        for (int i=0; i<array1.size(); i++){
            if (array1.get(i) != array2.get(i)){
                return false;
            }
        }
        return true;
    }


