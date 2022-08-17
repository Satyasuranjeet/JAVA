package prac.booooooofofd;

public class satya {
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int arr[]={2,4,7,3,2,5,7,8,99,3,2,2,34,90};
                System.out.println(find(arr,99,0));
        System.out.println(find(arr,98,0));

    }


        }


