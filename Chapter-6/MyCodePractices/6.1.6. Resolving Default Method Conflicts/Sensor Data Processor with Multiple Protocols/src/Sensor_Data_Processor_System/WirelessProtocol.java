/* Package declaration to match directory structure */
package Sensor_Data_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface WirelessProtocol with default getProtocolName */
public interface WirelessProtocol {
    default String getProtocolName() {
        return "Wireless: WiFi";
    }

   // default int hashCode() {
        //return 6; // Attempted default hashCode(); note: won't override Object's hashCode() due to "class wins" rule
  //  }
}