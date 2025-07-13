package TaskManagement;

public final class PersonalTask implements Archivable {

    private String description;
    private boolean archived;

    public PersonalTask(String description) {
        this.description = description;
        this.archived = false;
    }

    public void archive() {
        archived = true;
        System.out.println("Archived personal task: " + description); // কনফার্মেশন মেসেজ
    }

    // readable টেক্সট
    @Override
    public String toString() {
        return "[Personal] " + description;
    }

}
