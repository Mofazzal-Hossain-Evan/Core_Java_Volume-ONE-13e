/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods. No conflict if one method is abstract (Horstmann, p. 261). *Effective Java* (Item 21) warns about potential issues with multiple default methods (Bloch, p. 112). */

/* Class containing main method for testing notifier classes */
public class NotificationHandler {
    public static void main(String[] args) {
        /* Test MultiChannelNotifierWithConflict: override resolves conflict */
        MultiChannelNotifierWithConflict notifierConflict = new MultiChannelNotifierWithConflict();
        System.out.println("MultiChannelNotifierWithConflict getSenderInfo(): " + notifierConflict.getSenderInfo());
        System.out.println();

        /* Test MultiChannelNotifierWithSuperclass: superclass wins, no conflict */
        MultiChannelNotifierWithSuperclass notifierSuper = new MultiChannelNotifierWithSuperclass();
        System.out.println("MultiChannelNotifierWithSuperclass getSenderInfo(): " + notifierSuper.getSenderInfo());
        System.out.println();

        /* Test MultiChannelNotifierWithAbstract: no conflict, uses default from EmailChannel */
        MultiChannelNotifierWithAbstract notifierAbstract = new MultiChannelNotifierWithAbstract();
        System.out.println("MultiChannelNotifierWithAbstract getSenderInfo(): " + notifierAbstract.getSenderInfo());
        System.out.println();

        /* Demonstrate scenario where both interfaces are abstract: AbstractMultiChannelNotifier is abstract */
        // Cannot instantiate AbstractMultiChannelNotifier directly; would need a concrete subclass
        // For example:
        // class ConcreteNotifier extends AbstractMultiChannelNotifier {
        //     @Override
        //     public String getSenderInfo() {
        //         return "Concrete Sender";
        //     }
        // }
        // But for demonstration, note that AbstractMultiChannelNotifier compiles as abstract without implementation
    }
}