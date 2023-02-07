open class Animal{
    open val  count:Int = 0
    open fun gotoSleep(){
        println("Zzzzzzzzz")
    }
    open fun makeNoise(){
        println("Durrrrrrrr")
    }
}

class Cat(override val count:Int = 100):Animal(){
//    override val count:Int = 100
    override fun makeNoise(){
        println("Moewwwww,$count")
    }
}

class Dog:Animal(){
    override val count:Int = 500
    override fun makeNoise(){
        println("Woooooooof,$count")
    }
}