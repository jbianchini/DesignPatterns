package abstractFactory

import abstractFactory.interfaces.Enemy

class Orc : Enemy {
    override fun health(): Int = 120
    override fun type(): String = "Warrior"
}