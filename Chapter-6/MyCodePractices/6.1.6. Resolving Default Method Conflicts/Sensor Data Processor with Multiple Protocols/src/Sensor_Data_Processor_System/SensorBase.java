/* Package declaration to match directory structure */
package Sensor_Data_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass SensorBase with concrete getProtocolName */
public class SensorBase {
    public String getProtocolName() {
        return "Base Protocol: Generic";
    }
}