package Superhero_Universe_System;

public sealed interface SuperBehavior permits Powered, Hero
{
    String getHeroClass();
}
