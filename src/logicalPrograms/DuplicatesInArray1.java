package logicalPrograms;

public class DuplicatesInArray1 {

    static void main(String[] args) {
        String arr[] = {"api", "sql","java","api","java","selenium"};

        int count = 0;
        String result = "Which are:";

        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if(arr[i].equals(arr[j])){
                    count++;
                    result += " " + arr[i];
                }
            }
        }

        System.out.println("\nTotal no. of duplicate elements: " + count);
        System.out.println(result);
    }
}
