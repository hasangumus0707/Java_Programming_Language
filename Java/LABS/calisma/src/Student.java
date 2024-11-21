public class Student {

    private int id;
    private String name;
    private int age;

    public Student(){

        id = 100;
        name = "New Student";
        age = 18;
    }

     public Student(int id , String name , int age){

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public float create()
    {
        return id*age;
    }
}
