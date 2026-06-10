┌─────────────────────────────────────────────────────────────────────┐
│                    🔒 SEALED LAYER                                  │
│                                                                     │
│                «sealed interface»                                   │
│                   MysticBehavior                                    │
│                 ──────────────────                                  │
│                 String getGuildRank()                               │
│          permits → SpellCaster, Mystic                              │
└──────────────────────────────┬──────────────────────────────────────┘
│
┌────────────┴────────────┐
│ extends                 │ implements
▼                         ▼
┌─────────────────────────────────────────────────────────────────────┐
│                    ⚡ INTERFACE LAYER                               │
│                                                                     │
│             «non-sealed interface»                                  │
│                   SpellCaster                                       │
│                ───────────────────                                  │
│                void castSpell(String)                               │
│                void restoreMana(int)                                │
│                SpellCaster getApprentice()                          │
│                                                                     │
│   💡 6.1.4 Static Methods (Factory + Utility)                       │
│   ┌─────────────────────────────────────────────────────────────┐  │
│   │  static String getSpellTier(int mana)                       │  │
│   │  static boolean isArchmage(int mana)                        │  │
│   │  static SpellCaster summonFromScroll(String type)           │  │
│   │                                                             │  │
│   │  private static validateMana()                              │  │
│   │  private static getTierName()   ← গোপন recipe              │  │
│   └─────────────────────────────────────────────────────────────┘  │
│                                                                     │
│       ┌──────────────────┬──────────────────┬──────────────────┐   │
│       │ extends          │ extends          │ extends          │   │
│       ▼                  ▼                  ▼                  │   │
│   Flyable 🕊️         Elemental 🔥       Telepathic 🧠         │   │
│  (Private + Default)   (MAX_ELEMENT)     (MAX_RANGE)            │   │
│  MAX_ALTITUDE=10000                                          │   │
└──────────────────────────────┬──────────────────────────────────────┘
│ implements
▼
┌─────────────────────────────────────────────────────────────────────┐
│                    🏛️ ABSTRACT LAYER                               │
│                                                                     │
│                  abstract class Mystic                              │
│                implements MysticBehavior                            │
│                 ─────────────────────                               │
│                 String name, mana, wisdom, guildRank               │
│                 getName(), getMana(), toString()                   │
│                 abstract getMysticType()                            │
└──────────────────────────────┬──────────────────────────────────────┘
│ extends (only one)
┌────────────────────┼────────────────────┬────────────────────┐
▼                    ▼                    ▼                    ▼
┌─────────────────┬────────────────────┬────────────────────┬────────────────────┐
│   CONCRETE      │   CONCRETE         │   CONCRETE         │   CONCRETE         │
│   CLASSES       │                    │                    │                    │
├─────────────────┼────────────────────┼────────────────────┼────────────────────┤
│  🧙 Merlin      │  🔮 Gandalf        │  📖 Hermione       │  🌑 Morgana        │
│  (final)        │  (final)           │  (final)           │  (final)           │
├─────────────────┼────────────────────┼────────────────────┼────────────────────┤
│ Flyable         │ Flyable            │ Telepathic         │ Flyable +          │
│ Elemental       │                    │                    │ Telepathic +       │
│ Comparable      │ Comparable         │ Comparable         │ Elemental +        │
│                 │                    │                    │ Comparable         │
└─────────────────┴────────────────────┴────────────────────┴────────────────────┘

                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                       📦 DATA LAYER                                 │
│                                                                     │
│                       class MysticStore                             │
│                     ───────────────────                             │
│                     Mystic[] mystics                                │
│                                                                     │
│  🧙 Merlin ×2, 🔮 Gandalf, 📖 Hermione, 🌑 Morgana                 │
└─────────────────────────────────────────────────────────────────────┘

                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                    ▶️ RUNTIME LAYER                                 │
│                                                                     │
│                 MysticGuildSystem (main)                            │
│                                                                     │
│  • Static Methods          → SpellCaster.getSpellTier()             │
│  • Private Methods         → canFlyHigh() (default + private)      │
│  • Multiple Implements     → Morgana (3 interfaces)                 │
│  • Polymorphism, Sealed,   │ Comparable, Pattern Matching etc.     │
└─────────────────────────────────────────────────────────────────────┘