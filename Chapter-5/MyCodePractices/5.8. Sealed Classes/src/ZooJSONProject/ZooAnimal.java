package ZooJSONProject;

sealed interface ZooAnimal extends ZooValue
        permits ZooLion, ZooTiger, ZooParrot, ZooElephant, ZooSnake, ZooVoid {}

