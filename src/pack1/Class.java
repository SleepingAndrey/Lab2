package pack1;

public class Class {
    public static void main(String[] args) {

        Vector vector1 = new Vector(10, 21);
        Vector vector2 = new Vector(12, 19);
        //vector1.setVector();                   // Вызов метода
        vector1.getInfo();
        vector1.getLength();
        /*
        Human.description = "Nice";
        //Human.getDescription();
        human1.getAllFields();
        human2.getAllFields();
        Human.description = "Bad";
        human1.getAllFields();
        human2.getAllFields();
        */

        // Пример использования статического метода
        // System.out.println(Math.pow(2,4)); // Класс со статическими методами
    }
}

class Vector {
    private int x1;
    private int y1;
    private double length;

    //private static int countPeople; // Эта переменная одна для всех объектов
    //public static String description; // СТАТИЧЕСКАЯ ПЕРЕМЕННАЯ. Принадлежит не объекту, а целому классу

    public Vector(int x1, int y1){      // Конструктор
        this.x1 = x1;
        this.y1 = y1;
        System.out.println("Вектор создан");
    }
    public void setVector(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    public void getInfo(){
        System.out.println("Вектор с координатами: " + x1 + "," + y1);
    }
    public void getLength(){
        length = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        System.out.println("Длина вектора: " + length);
    }
}
// Скорбный коммент