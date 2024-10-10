
package linearlysearch;

/**
 * Name : Danah Matoq Aldadi
 * ID : 445006203
 */

//----------------------------------------------------------------------------------------------

// Java code for linearly search x in arr[].
// If x is present, it returns the index; otherwise, it returns -1.

class LinearSearch {

    // This function returns the index of element x in arr[]
    static int search(int arr[], int n, int x) {
        // Iterate through the array to find the element
        for (int i = 0; i < n; i++) {
            // Return the index of the element if it is found
            if (arr[i] == x) {
                return i;
            }
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        // Initialize the array with values
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length; // Get the number of elements in the array
        int x = 4; // Element to search for
        int index = search(arr, n, x); // Perform the search

        // Check if the element was found and print the appropriate message
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at position " + index); // Output the index of the found element
        }
    }
}

//------------------------------------------------------------------------------------------------------

