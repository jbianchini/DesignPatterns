package abstractFactory

import abstractFactory.interfaces.Character

class Alien : Character {
    override fun health(): Int = 150
    override fun weapon(): String = "Laser gun"

}