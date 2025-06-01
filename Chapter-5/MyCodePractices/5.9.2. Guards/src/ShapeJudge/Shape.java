package ShapeJudge;

sealed interface Shape permits Circle, Rectangle, Triangle {}
