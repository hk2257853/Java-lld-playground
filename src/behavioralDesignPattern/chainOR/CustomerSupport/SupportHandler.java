package behavioralDesignPattern.chainOR.CustomerSupport;

abstract class SupportHandler {
    private SupportHandler nextHandler;

    public SupportHandler setNext(SupportHandler next) {
        this.nextHandler = next;
        return next; // enables fluent chaining
    }

    protected void escalate(int level) {
        if (nextHandler != null) {
            nextHandler.handle(level);
        } else {
            System.out.println("[System] No handler available for level-" + level + " issue!");
        }
    }

    public abstract void handle(int issueLevel);
}
