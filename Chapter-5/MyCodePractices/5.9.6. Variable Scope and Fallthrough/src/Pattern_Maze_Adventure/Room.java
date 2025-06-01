package Pattern_Maze_Adventure;

sealed interface Room permits TrapRoom, TreasureRoom, EmptyRoom, MagicRoom {}
