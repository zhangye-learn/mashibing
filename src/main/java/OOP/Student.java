package OOP;

public class Student {
    int stuNumber;
    String name;
    int age = 20;

    void study(){
        System.out.println("我正在学习");
    }

    void eat(String food){
        System.out.println("我正在吃" + food);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        student.name = "zhangsan";
        student.age = 20;
        student.stuNumber = 12;
        System.out.println(student.name);
        System.out.println(student.stuNumber);
        student.eat("apple");
    }
}
