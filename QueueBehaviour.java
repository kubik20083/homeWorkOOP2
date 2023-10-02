public interface QueueBehaviour {
    void takeInQueue(Human human); // добавление человека в очередь

    Human releaseFromQueue(); // удаление человека из очереди

    boolean isEmptyQueue(); // состояние очереди
    int size(); // размер очереди

}
