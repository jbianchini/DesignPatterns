package abstractFactory

import abstractFactory.interfaces.Enemy

class Robot : Enemy {
    override fun health(): Int = 200

    override fun type(): String = "Killing machine"
}