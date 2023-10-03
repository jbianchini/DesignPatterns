package abstractFactory.interfaces

interface LevelFactory {
    fun createCharacter(): Character
    fun createEnemy(): Enemy
}