package Music_Festival_System;

public interface Singable extends Playable{
    double MAX_NOTE = 10.0;
    void sing(String lyrics);

    // =====================
    // 6.1.4 DRY Private Methods
    // canHitNote() আর getNoteStatus() দুটোই
    // checkNote() + checkVoice() ব্যবহার করে
    // =====================
    default boolean canHitNote(String note){
        return checkNote(note) && checkVoice();
    }

    default String getNoteStatus(String note){
        if (chckNote(note) && checkVoice()){
            return "🎵 " + note +  " — Perfect pitch! ✅";
        } else {
            return "❌ Cannot hit: " + note;
        }
    }
    private boolean checkNote(String note){
        return note != null && !note.isEmpty();
    }
    private boolean checkVoice(){
        return true;
    }
}

