/* Package declaration to match directory structure */
package Sensor_Data_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* HybridSensor class implementing both interfaces, resolving conflict by overriding */
public class HybridSensorWithConflict implements WirelessProtocol, WiredProtocol {
    @Override
    public String getProtocolName() {
        return WirelessProtocol.super.getProtocolName() + " / " + WiredProtocol.super.getProtocolName(); // Resolve by combining using super
    }
}