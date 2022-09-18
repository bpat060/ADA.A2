/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2;

/**
 *
 * @author Sheet
 */
public class BinarySearch {
    
    int binarySearch(int arr[], int l, int r, int x){
        
        if (r >= 1){
            int mid = l + (r-l) / 2;
            
            //if the element is present at the 
            //middle itsself 
            if (arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                return binarySearch(arr, l, mid - 1, x);
            }else{
                return binarySearch(arr, l, mid + 1, x);
            }
        }
        return -1;
    }
    
    public static void main(String arg[]){
        
        BinarySearch ob = new BinarySearch();
        
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        
        int result = ob.binarySearch(arr, 0, n-1, x);
        if(result == -1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
}
