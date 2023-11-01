package Loops_3;

//12. Print gender (Male/Female) program according to given M/F using switch
public class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'M'; // Change this character as needed

        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
