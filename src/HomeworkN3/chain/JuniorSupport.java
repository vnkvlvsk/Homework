package HomeworkN3.chain;

public class JuniorSupport extends SupportHandler {
    @Override
    public void handle(int level) {
        if (level == 1) {
            System.out.println("Джуниор решил проблему уровня " + level);
        } else if (next != null) {
            System.out.println("Джуниор передаёт проблему уровня " + level + " дальше");
            next.handle(level);
        }
    }
}
