package behavioralDesignPattern.chainOR.CustomerSupport;

class FrontlineSupport extends SupportHandler {
    @Override
    public void handle(int issueLevel) {
        if (issueLevel <= 1) {
            System.out.println("[Frontline] Resolved level-" + issueLevel + " issue.");
        } else {
            System.out.println("[Frontline] Escalating level-" + issueLevel + " issue...");
            escalate(issueLevel);
        }
    }
}