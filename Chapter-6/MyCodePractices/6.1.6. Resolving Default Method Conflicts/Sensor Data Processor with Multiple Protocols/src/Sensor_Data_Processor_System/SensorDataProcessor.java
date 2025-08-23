/* Package declaration to match directory structure */
package Sensor_Data_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods. For Object methods like hashCode(), interface defaults are ignored in favor of Object's implementation unless explicitly overridden to call the default, reinforcing compatibility (Horstmann, p. 262). *Effective Java* (Item 20) warns about careful use of defaults, especially with Object methods (Bloch, p. 109). */

/* Class containing main method for testing sensor classes */
public class SensorDataProcessor {
    public static void main(String[] args) {
        /* Test HybridSensorWithConflict: override resolves conflict */
        HybridSensorWithConflict sensorConflict = new HybridSensorWithConflict();
        System.out.println("HybridSensorWithConflict getProtocolName(): " + sensorConflict.getProtocolName());
        System.out.println();

        /* Test HybridSensorWithSuperclass: superclass wins, no conflict */
        HybridSensorWithSuperclass sensorSuper = new HybridSensorWithSuperclass();
        System.out.println("HybridSensorWithSuperclass getProtocolName(): " + sensorSuper.getProtocolName());
        System.out.println();

        /* Test default hashCode() in WirelessProtocol: doesn't override Object's hashCode() */
        System.out.println("HybridSensorWithConflict hashCode(): " + sensorConflict.hashCode()); // Uses Object's hashCode()
        System.out.println("To use WirelessProtocol's default hashCode(), need explicit override, e.g.:");
        // @Override
        // public int hashCode() {
        //     return WirelessProtocol.super.hashCode();
        // }
        // Then it would return 42, but without, it's Object's identity-based hash

        /* Note: Attempting default hashCode() in interface is allowed, but ineffective for overriding Object's due to "class wins." This prohibits easy redefinition, ensuring compatibility with existing code expecting Object's behavior. */
    }
}