/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2;

/**
 *
 * @author Sheet
 */
// Java implementation of recursive Binary Search
class BinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int mxn[][], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (mxn[mid][0] == x) {
                return mid;
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (mxn[mid][0] > x) {
                return binarySearch(mxn, l, mid - 1, x);
            }

            // Else the element can only be present
            // in right subarray
            return binarySearch(mxn, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int[][] mxn = {
            { 20, 40, 100, 130, 150, 200 },
            { 40, 140, 250, 320, 400, 450},
            { 100, 250, 350, 420, 450, 500},
        };
        int n = mxn.length;
        int x = 40;
        int result = ob.binarySearch(mxn, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
