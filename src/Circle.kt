class Circle : Shape( "Circle") {
    private var radius: Int = 0

    fun setDimensions(radius: Int) {
        this.radius = radius
    }
    override fun printDimesions() {
        println("Radius: $radius")
    }
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

}