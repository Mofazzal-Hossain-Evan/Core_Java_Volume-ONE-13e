package MemoryPuzzleTracker;

public class Move {
    private int MoveNo;
    private String actionType, timeStamp;

    public Move(int moveNo, String actionType, String timeStamp) {
        MoveNo = moveNo;
        this.actionType = actionType;
        this.timeStamp = timeStamp;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getMoveNo() {
        return MoveNo;
    }

    public String getActionType() {
        return actionType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString(){
        return "Move #" + MoveNo + "- Action" + actionType + ", Time: " + timeStamp;
    }
}
