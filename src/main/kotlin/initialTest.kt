open class Base{
    open val name:String = "Mama"
    open val price:String = "50000"
    init {
        println("I am in Base Class, $name")
    }
    open fun displayName(){
        println("I am in " + this.name)
    }
    open fun displayPrice(){}
}

open class Child:Base(){
    override fun displayName() {
        super.displayName()
        println("I am in child class")
    }
    override fun displayPrice(){
        println("I am " + this.price)
    }
}

//class GrandChild:Child(){
//    init {
//        println("I am in Grand Child Class")
//    }
//}