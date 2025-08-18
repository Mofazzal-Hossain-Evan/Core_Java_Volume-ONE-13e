package Event_Listener_System;

public class Main {

    public static void main(String[] args) {
        EventListener userListener = new UserEventListener();
        EventListener systemListener = new SystemEventListener();

        Event e1 = new Event("login", "UserModule");
        Event e2 = new Event("error", "UserModule");
        Event e3 = new Event("shutdown", "SystemModule");

        simulateEvent(userListener, e1);

    }

    private static void simulateEvent(EventListener listener, Event event){
        if (listener.isActive()){
            try {
                listener.onEvent(event);
                listener.onEventProcessed(event);
            } catch (Exception e){
                listener.onError(e);
            }
        } else {
            System.out.println("[System] Listener is not active, skipping: " + event);

        }
    }
}
