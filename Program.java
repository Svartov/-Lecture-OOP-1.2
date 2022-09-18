package sample;

public class Program {

    public static void main(String[] args) {


        Triangle triangle1 = new Triangle(3.67,3.5,3.3);
        Triangle triangle2 = new Triangle(10,5,9.5);

        System.out.println(triangle1.getString() +  " = "+ triangle1.getAnswer()); // Выводим на консолль резульатат
        System.out.println(triangle2.getString() +  " = "+ triangle2.getAnswer()); // Выводим на консолль резульатат
    }
}