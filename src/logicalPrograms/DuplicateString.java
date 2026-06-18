package logicalPrograms;

public class DuplicateString {

    static void main(String[] args) {
        String arr[] = {"Om","Sai","Ram","Om","Sai"};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = true;
            for (int j = 0; j < i; j++) {
                 if (arr[j].equals(arr[i])) {
                    isDuplicate = false;
                    break;
                }

            }
            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
//=====================================================================================



    }
}
