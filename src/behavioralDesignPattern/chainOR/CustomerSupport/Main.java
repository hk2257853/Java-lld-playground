package behavioralDesignPattern.chainOR.CustomerSupport;

public class Main {
    public static void main(String[] args) {

        // Create handlers
        SupportHandler frontline = new FrontlineSupport();
        SupportHandler lead     = new TeamLead();
        SupportHandler manager  = new Manager();

        // Build the chain (fluent style)
        frontline.setNext(lead)
                 .setNext(manager);

        // Fire requests
        for (int level = 1; level <= 4; level++) {
            System.out.println("\\n--- Issue Level " + level + " ---");
            frontline.handle(level);
        }
    }
}