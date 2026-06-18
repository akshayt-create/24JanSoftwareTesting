package exceptionStudy;

public class VotingQualification {

    static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new InvalidAgeException("Your age is not valid for voting");

        } else {
            System.out.println("Your age is valid for voting");

        }
    }
}
