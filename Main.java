public class Main {
    public static void main(String[] args) {
        Human name = new Human();
        name.setName("Aleksandr");

        name.setMakeOrder();
        name.setTakeOrder();
        System.out.println(name);

        Market market = new Market();

        Human human = new Human();
        human.setName("Sergey");
        Human human2 = new Human();
        human2.setName("Pety");
        Human human3 = new Human();
        human3.setName("Roma");

        market.takeInQueue(human3);
        market.takeInQueue(human);
        market.takeInQueue(human2);

        System.out.println("Размер очереди  " + market.size());
        System.out.println("Первый в очереди  " + market.releaseFromQueue());
        System.out.println("Обновленный размер очереди  " + market.size());

        Order order = new Order("Заказ 1");
        Order order2 = new Order("Заказ 2");

        market.placeOrderet(order);
        market.placeOrderet(order2);

        market.update();
        market.update();
        market.update();
        // market.update();

    }
}
