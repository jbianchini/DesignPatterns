package abstractFactory

import abstractFactory.interfaces.Character
import abstractFactory.interfaces.Enemy
import abstractFactory.interfaces.LevelFactory

class FantasyLevelFactory : LevelFactory {
    override fun createCharacter(): Character = Elf()
    override fun createEnemy(): Enemy = Orc()
}