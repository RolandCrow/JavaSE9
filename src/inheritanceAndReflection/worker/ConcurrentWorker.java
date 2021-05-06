package inheritanceAndReflection.worker;

public class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work); // применяем суперкласс
        t.start();
    }
}
