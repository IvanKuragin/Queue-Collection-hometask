import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> clients = new LinkedList();
        clients.addAll(generateClients());
        while (!clients.isEmpty()) {
            Person client = clients.element();
            client.tickets--;
            System.out.println("Клиент " + client.firstName + " "
                    + client.lastName + " прокатился на аттракционе!"
                    + " Осталось билетов: " + client.tickets);
            System.out.println(printDelim());
                if (client.tickets == 0) {
                    clients.remove(client);
                } else {
                    clients.pollFirst();
                    clients.offerLast(client);
                }
            }
        }

    public static List<Person> generateClients() {
        Person connor = new Person("John", "Connor", 2);
        Person sheldon = new Person("Sheldon", "Cooper", 3);
        Person molder = new Person("Fox", "Molder", 1);
        Person cooper = new Person("Dale", "Cooper", 4);
        Person murray = new Person("Bill", "Murray", 5);
        List<Person> clients = new LinkedList<>();
        clients.add(connor);
        clients.add(sheldon);
        clients.add(molder);
        clients.add(cooper);
        clients.add(murray);
        return clients;
    }

    public static String printDelim () {
        return "===================================";
    }
}
