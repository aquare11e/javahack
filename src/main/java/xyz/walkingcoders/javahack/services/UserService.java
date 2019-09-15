package xyz.walkingcoders.javahack.services;

import xyz.walkingcoders.javahack.db.Client;

public class UserService {
    private static ThreadLocal<Client> currentClient = new ThreadLocal<>();

    public static Client getClient() {
        return currentClient.get();
    }

    public static void setClient(Client client) {
        currentClient.set(client);
    }
}
