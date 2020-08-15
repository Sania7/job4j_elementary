package ru.job4j.poly;

public class Service {
    private  Store store; // поле переменная

    public Service(Store store) { // конструктор переменной
        this.store = store;
    }

    public void extract() { // метод извлечь
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        Store store = new DbStore(); // объект магазин
//        DbStore store = new FileStore();
        Service service = new Service(store); // объект услуга
        service.extract(); //вызов метода извлечь
    }
}
