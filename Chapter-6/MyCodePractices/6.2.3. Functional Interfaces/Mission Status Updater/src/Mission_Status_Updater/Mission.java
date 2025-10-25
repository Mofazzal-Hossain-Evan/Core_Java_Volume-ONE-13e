package Mission_Status_Updater;

public class Mission {
    private String name;
    private  int progress;
    private String status;

    public Mission(String name, int progress, String status) {
        this.name = name;
        this.progress = progress;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", progress=" + progress +
                ", status='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
