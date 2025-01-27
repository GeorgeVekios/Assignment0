class Square : Shape ( "Square") {
    private var length: Int = 0
    private var height: Int = 0

    fun setDimensions(width: Int, height: Int) {
        this.length = width
        this.height = height
    }

    override fun printDimesions() {
        println("Length: $length\nHeight: $height")
    }
    override fun getArea(): Double {
        return (length * height).toDouble()
    }

}