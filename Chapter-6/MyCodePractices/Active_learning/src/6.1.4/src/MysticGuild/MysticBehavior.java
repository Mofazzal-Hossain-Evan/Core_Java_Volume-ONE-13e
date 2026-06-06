package MysticGuild;



public sealed interface MysticBehavior
 permits SpellCaster, Mystic{
    String getGuidRank();
}
