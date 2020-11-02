package OOP;

public class ThisDemo {

    String name;
    int age;

    public ThisDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void test1(){
        System.out.println("test1....");
    }

    public void test2(String name){
        System.out.println("test2....");
        this.test1();
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("zhangsan",19);
        System.out.println(td.age);
        System.out.println(td.name);
        td.test2("lisi");

    }
}
