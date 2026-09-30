package arrays;

public class reverseArray {

   public void reverse(int arr[]){
       int a = 0;
       int b = arr.length - 1;

       while (a < b) {
           int temp = arr[b];
           arr[b] = arr[a];
           arr[a] = temp;

           a++;
           b--;
       }
   }


   public static void main (String []args){
       int[] arr = {40,30,6,9,0,2,60};

       reverseArray obj = new reverseArray();
       obj.reverse(arr);


       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }
}

