package data;
public class Person{
    // 物件屬性
    public int age = 40;
    public String name = "小黑";
    // 物件建構式
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public Person(String name){
        this.age = 15;
        this.name = name;
    }
    // 物件方法
    public void talk(){
        System.out.println(this.name + ": " + this.age);
    }
}