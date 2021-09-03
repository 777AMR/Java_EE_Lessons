package servlets;

public class Human implements doIt{
    @Override
    public void speak() {

    }
}

interface doIt{
    void speak();
}

abstract class People{
    int age;
}