
public class Main {
    public static void main(String[] args) {

        MasterStudent masterStudent = new MasterStudent(12,50,70,5);
        BachelourStudent bachelourStudent = new BachelourStudent(11,45,68);
        PhDStudent  phDStudent = new PhDStudent(9,63,90,6,18);

        System.out.println(masterStudent.computeTotalScore());
        System.out.println(bachelourStudent.computeTotalScore());
        System.out.println(phDStudent.computeTotalScore());
    }
}