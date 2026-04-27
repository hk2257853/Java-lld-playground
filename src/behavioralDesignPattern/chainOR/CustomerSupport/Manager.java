package behavioralDesignPattern.chainOR.CustomerSupport;

class Manager extends SupportHandler {
    @Override
    public void handle(int issueLevel) {
        if (issueLevel <= 3) {
            System.out.println("[Manager] Resolved level-" + issueLevel + " issue.");
        } else {
            System.out.println("[Manager] Escalating level-" + issueLevel + " issue...");
            escalate(issueLevel);
        }
    }
}