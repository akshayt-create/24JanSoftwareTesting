package arrayStudy;

public class ArraySample4 {
    static void main(String[] args) {

        String subject[][] = {{"ab","bc","cd"}, {"de","ef","fg"}};

        //outer loop --> row
        for(int i = 0; i <= subject.length - 1; i++){

            //inner loop --> column
            for(int j = 0; j <= subject[i].length - 1; j++){
                System.out.print(subject[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
