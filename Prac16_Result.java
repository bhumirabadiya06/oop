 import java.util.Scanner;

 
interface Classify {
    String getDivision(double average);
}

 
class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

 
public class Prac16_Result {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Average Marks: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        String division = r.getDivision(avg);

        System.out.println("Division: " + division);

        sc.close();
    }
}
