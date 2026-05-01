```
VehicleSystem — Architecture Diagram
═══════════════════════════════════════════════════════════════

┌─────────────────────────────────────────────────────────────┐
│                    SEALED LAYER                             │
│                                                             │
│         «sealed interface»                                  │
│           VehicleBehavior                                   │
│         ─────────────────                                   │
│         getPowerType()                                      │
│         permits → Movable only                              │
└──────────────────────┬──────────────────────────────────────┘
                       │ extends
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                  INTERFACE LAYER                            │
│                                                             │
│      «non-sealed interface»                                 │
│            Movable                                          │
│         ─────────────                                       │
│         move()                                              │
│         getSpeed()                                          │
│              │                                              │
│    ┌─────────┼──────────────────┐                          │
│    │ extends │ extends           │ extends                  │
│    ▼         ▼                   ▼                          │
│ «interface»  «interface»    «interface»                     │
│ FuelPowered  ElectricPowered SpeedComparable                │
│ ──────────── ─────────────── ─────────────────             │
│ getFuelCap() getBatteryCap() MAX_SAFE_SPEED=200             │
│ refuel()     charge()        compareSpeed()                 │
└──────────────────────┬──────────────────────────────────────┘
                       │ implements
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                 ABSTRACT LAYER                              │
│                                                             │
│              abstract class Vehicle                         │
│         ───────────────────────────                         │
│         name, speed, capacity                               │
│         getName(), getSpeed()                               │
│         getCapacity(), printInfo()                          │
│         toString()                                          │
│         getVehicleType() ← abstract                         │
└──────────────────────┬──────────────────────────────────────┘
                       │ extends
          ┌────────────┼─────────────────┐
          ▼            ▼                 ▼
┌─────────────────────────────────────────────────────────────┐
│               CONCRETE CLASS LAYER                          │
│                                                             │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────────┐  │
│  │     Car      │  │     Bike     │  │      Truck       │  │
│  │ ──────────── │  │ ──────────── │  │ ──────────────── │  │
│  │ +Movable     │  │ +Movable     │  │ +Movable         │  │
│  │ +FuelPowered │  │ +FuelPowered │  │ +FuelPowered     │  │
│  │ +SpeedComp   │  │ +ElecPowered │  │ +SpeedComparable │  │
│  │ +Comparable  │  │ +SpeedComp   │  │                  │  │
│  │              │  │              │  │                  │  │
│  │ powerType    │  │ powerType    │  │ powerType        │  │
│  └──────────────┘  └──────────────┘  └──────────────────┘  │
│                                                             │
│  ┌──────────────────────────────┐                          │
│  │        ElectricCar  (final)  │                          │
│  │ ──────────────────────────── │                          │
│  │ +Movable                     │                          │
│  │ +ElectricPowered             │                          │
│  │ +SpeedComparable             │                          │
│  │ +Comparable<ElectricCar>     │                          │
│  │                              │                          │
│  │ powerType = "Electric"       │                          │
│  └──────────────────────────────┘                          │
└──────────────────────┬──────────────────────────────────────┘
                       │ stored in
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                   DATA LAYER                                │
│                                                             │
│              class VehicleStore                             │
│         ───────────────────────────                         │
│         Vehicle[] vehicles  ← polymorphic array            │
│         getVehicles()                                       │
│                                                             │
│   stores → Car × 3, ElectricCar × 2                        │
│             Bike × 3 (Fuel), Bike × 2 (Electric)           │
│             Truck × 4 (Diesel), Truck × 1 (Electric)       │
└──────────────────────┬──────────────────────────────────────┘
                       │ used by
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                  RUNTIME LAYER                              │
│                                                             │
│              class VehicleSystem (main)                     │
│         ─────────────────────────────────                   │
│                                                             │
│  1. Interface variable declare                              │
│     Movable m1 = new Car(...)                               │
│                                                             │
│  2. instanceof check                                        │
│     v instanceof FuelPowered                                │
│     v instanceof SpeedComparable                            │
│                                                             │
│  3. Interface Polymorphism                                  │
│     Movable f = new Car(...)  → f.move()                    │
│                                                             │
│  4. Constant check                                          │
│     speed > SpeedComparable.MAX_SAFE_SPEED                  │
│                                                             │
│  5. Sealed interface test                                   │
│     VehicleBehavior vb = new Car(...)                       │
│                                                             │
│  6. Comparable + Generic method                             │
│     processData(CarA, CarB)                                 │
│     <T extends Comparable<T>>                               │
│                                                             │
│  7. Pattern matching instanceof                             │
│     if (item instanceof Movable m) { m.move(); }           │
└─────────────────────────────────────────────────────────────┘

═══════════════════════════════════════════════════════════════
Chapter 6.1.2 — Properties Covered:
  ✔ 1. Interface variable (new করা যায় না)
  ✔ 2. instanceof check
  ✔ 3. Interface extends Interface (hierarchy)
  ✔ 4. Constants (MAX_SAFE_SPEED)
  ✔ 5. Multiple implements
  ✔ 6. Sealed interface
═══════════════════════════════════════════════════════════════
```