package HomeworkN3.chain;

public class SeniorSupport extends SupportHandler {
    @Override
    public void handle(int level) {
        if (level == 2) {
            System.out.println("Сеньор решил проблему уровня " + level);
        } else if (next != null) {
            System.out.println("Сеньор передаёт проблему уровня " + level + " дальше");
            next.handle(level);
        }
    }
}
