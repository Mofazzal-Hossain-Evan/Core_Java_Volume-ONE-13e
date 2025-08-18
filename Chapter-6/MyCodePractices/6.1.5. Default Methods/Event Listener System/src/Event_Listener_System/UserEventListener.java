package Event_Listener_System;

public class UserEventListener implements EventListener{

    public void onEvent(Event event){
        System.out.println("[User Listener] Received event: " + event);
        if (event.getName().equalsIgnoreCase("error")){
            onError(new RuntimeException("User event error simulated!"));
        }


    }

    public void onError(Exception e) {
        System.out.println("[User Listener Custom Error] " + e.getMessage());
    }


}
