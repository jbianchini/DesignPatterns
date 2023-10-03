import abstractFactory.Elf
import abstractFactory.Orc
import abstractFactory.SpaceLevelFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SpaceLevelFactoryTest {

    @Test
    fun `createCharacter, given a space factory, should create an Alien character`(){
        val spaceLevelFactory = SpaceLevelFactory()
        val alienCharacter = spaceLevelFactory.createCharacter()

        Assertions.assertEquals(Elf::javaClass.name, alienCharacter::javaClass.name)
        Assertions.assertEquals(150, alienCharacter.health())
        Assertions.assertEquals("Laser gun", alienCharacter.weapon())
    }

    @Test
    fun `createCharacter, given a space factory, should create an Robot character`(){
        val spaceLevelFactory = SpaceLevelFactory()
        val robotEnemy = spaceLevelFactory.createEnemy()

        Assertions.assertEquals(Orc::javaClass.name, robotEnemy::javaClass.name)
        Assertions.assertEquals(200, robotEnemy.health())
        Assertions.assertEquals("Killing machine", robotEnemy.type())
    }

}