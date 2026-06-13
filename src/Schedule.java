import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<String> lessons;

    public Schedule(List<String> lessons) {
        this.lessons = new ArrayList<>(lessons);
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void addLesson(String lesson) {
        lessons.add(lesson);
    }

    public void removeLesson(String lesson) {
        lessons.remove(lesson);
    }
}
