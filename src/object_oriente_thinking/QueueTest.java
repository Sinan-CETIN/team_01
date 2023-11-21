package object_oriente_thinking;

public class QueueTest {
    public static void main(String[] args) {

        Queue[] cinemaQueueList = new Queue[50];

        for (int i = 0; i < cinemaQueueList.length; i++) {
            cinemaQueueList[i] = new Queue();
            int clientNumber = (int) (Math.random() * 5 + 5);
            System.out.println("Queue number -> " + (i + 1) + " eleman sayisi -> " + clientNumber);
            addClientToQueue(cinemaQueueList[i], clientNumber);
        }

        int price = 5;
        int totalClient = 0;

        for (int i = 0; i < cinemaQueueList.length; i++) {
            totalClient += cinemaQueueList[i].getSize();
            System.out.println((i + 1) + " -> " + cinemaQueueList[i].getSize());
        }

        for (int i = 0; i < cinemaQueueList.length; i++) {
            System.out.print("Queue " + (i + 1) + " -> ");
            while(!cinemaQueueList[i].isEmpty()) {
                System.out.print(cinemaQueueList[i].dequeue() + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < cinemaQueueList.length; i++) {
            System.out.println((i + 1) + " -> " + cinemaQueueList[i].getSize());
        }


        System.out.println("Total Musteri -> " + totalClient);
        System.out.println("Hasilat -> "+totalClient * price);

    }

    public static void addClientToQueue(Queue queue, int number) {
        for (int i = 0; i < number; i++) {
            int clientName = (int) (Math.random() * 50 + 100);
            queue.enqueue(clientName);
        }
    }

}
