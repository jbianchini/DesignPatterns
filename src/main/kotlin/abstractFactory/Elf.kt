package abstractFactory

import abstractFactory.interfaces.Character

class Elf : Character {
    override fun health(): Int = 100
    override fun weapon(): String = "Bow & arrow"
}