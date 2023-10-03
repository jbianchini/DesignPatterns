package abstractFactory

import abstractFactory.interfaces.Enemy
import abstractFactory.interfaces.LevelFactory
import abstractFactory.interfaces.Character

class SpaceLevelFactory : LevelFactory {
    override fun createCharacter(): Character = Alien()
    override fun createEnemy(): Enemy = Robot()
}