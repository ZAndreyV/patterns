package prototype;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра продукта "Пицца"
        Food pizza = new Pizza();
        // Подготовка пиццы
        pizza.prepare();

        // Клонирование пиццы
        Food clonedPizza = (Food) pizza.clone();
        // Подготовка клонированной пиццы
        clonedPizza.prepare();

        // Создание экземпляра продукта "Салат"
        Food salad = new Salad();
        // Подготовка салата
        salad.prepare();

        // Клонирование салата
        Food clonedSalad = (Food) salad.clone();
        // Подготовка клонированного салата
        clonedSalad.prepare();
    }
}
