import java.util.List;

public interface MarketBehaviour {
    
    void placeOrderet(Order order); // Помещение заказа

    Order releaseFromMarket(); // Взятие заказа

    boolean hasOrder();  // Проверка заказа в очереди

   public void update(); // Обновление очереди
}
