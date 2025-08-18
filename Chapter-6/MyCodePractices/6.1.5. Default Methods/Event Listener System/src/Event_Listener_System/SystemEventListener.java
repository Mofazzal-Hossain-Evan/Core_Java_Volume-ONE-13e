package Event_Listener_System;

public class SystemEventListener implements EventListener{

    public void onEvent(Event event){
        System.out.println("[System Listener] Handling system event: " + event);
    }

    public boolean isActive(){
        return false;
    }
}
