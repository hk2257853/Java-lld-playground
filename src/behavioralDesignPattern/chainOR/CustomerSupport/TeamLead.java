package behavioralDesignPattern.chainOR.CustomerSupport;

class TeamLead extends SupportHandler {
    @Override
    public void handle(int issueLevel) {
        if (issueLevel <= 2) {
            System.out.println("[Team Lead] Resolved level-" + issueLevel + " issue.");
        } else {
            System.out.println("[Team Lead] Escalating level-" + issueLevel + " issue...");
            escalate(issueLevel);
        }
    }
}