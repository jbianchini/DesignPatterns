package abstractFactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FantasyLevelFactoryTest {

    @Test
    fun `createCharacter, given a fantasy factory, should create an Elf character`(){
        val fantasyLevelFactory = FantasyLevelFactory()
        val elfCharacter = fantasyLevelFactory.createCharacter()

        Assertions.assertEquals(Elf::javaClass.name, elfCharacter::javaClass.name)
        Assertions.assertEquals(100, elfCharacter.health())
        Assertions.assertEquals("Bow & arrow", elfCharacter.weapon())
    }

    @Test
    fun `createEnemy, given a fantasy factory, should create an Orc character`(){
        val fantasyLevelFactory = FantasyLevelFactory()
        val orcEnemy = fantasyLevelFactory.createEnemy()

        Assertions.assertEquals(Orc::javaClass.name, orcEnemy::javaClass.name)
        Assertions.assertEquals(120, orcEnemy.health())
        Assertions.assertEquals("Warrior", orcEnemy.type())
    }

}