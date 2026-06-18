package logicalPrograms;

public class DuplicatesInArray {

    //Find duplicates in array
    static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 5, 4, 4, 6};

        int count = 0;
        String result = "Which are:";

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    result += " " + arr[i];
                }
            }
        }

        System.out.println("\nTotal no. of duplicate elements: " + count);
        System.out.println(result);
    }
}
