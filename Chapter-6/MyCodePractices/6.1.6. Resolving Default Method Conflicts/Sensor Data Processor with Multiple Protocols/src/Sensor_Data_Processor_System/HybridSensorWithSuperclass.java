/* Package declaration to match directory structure */
package Sensor_Data_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* HybridSensor class extending SensorBase and implementing both interfaces, no override needed */
public class HybridSensorWithSuperclass extends SensorBase implements WirelessProtocol, WiredProtocol {
    // No override; uses superclass getProtocolName()
}