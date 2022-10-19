//package binarysearch;
//
//import java.util.Arrays;
//
//public class Core {
//    static int[] arr = new int[];
//    public static void main(String[] args) {
//        int a = binarySearch1(5,0, arr.length-1);
//        int i = Arrays.binarySearch(arr, 0, arr.length, 5);
//
//    }
//
//    private static int binarySearch1(int key, int low, int high) {
//        int mid;
//        if(low <= high) {
//            mid = (low + high) / 2;
//
//            if (key == arr[mid]) {
//                return mid;
//            } else if(key <arr[mid]) {
//                return binarySearch1(key, low, mid-1);
//            } else {
//                return binarySearch1(key, mid +1, high);
//            }
//        }
//        return -1;
//
//    }
//
//    private static int binarySearch2(int key, int low, int high) {
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//
//            if (key == arr[mid]) {
//                return mid;
//            } else if(key < arr[mid]) {
//                high = mid - 1;
//            } else  {
//                low = mid + 1;
//            }
//        }
//        return -1;
//
//    }
//}
