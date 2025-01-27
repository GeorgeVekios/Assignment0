import java.awt.Rectangle

fun main() {
    val circle : Shape = Circle()
    val square : Shape = Square()
    val triangle : Shape = Triangle()
    val equilateralTriangle : Shape = EquilateralTriangle()

    print("Enter circle radius (int): ")
    (circle as Circle).setDimensions(readln().toInt())
    println("Shape Name: ${circle.name}")
    println("Dimension(s): ")
    circle.printDimesions()
    println("Area: ${circle.getArea()}")

    print("Enter square dimensions (int): ")
    val sqSide = readln().toInt()
    (square as Square).setDimensions(sqSide, sqSide)
    println("Shape Name: ${square.name}")
    println("Dimension(s): ")
    square.printDimesions()
    println("Area: ${square.getArea()}")

    print ("Enter Triangle first side (int): ")
    val side1 = readln().toInt()
    print ("Enter Triangle second side (int): ")
    val side2 = readln().toInt()
    print("Enter Triangle third side (int): ")
    val side3 = readln().toInt()
    (triangle as Triangle).setDimensions(side1, side2, side3)
    println("Shape Name: ${triangle.name}")
    println("Dimension(s): ")
    triangle.printDimesions()
    println("Area: ${triangle.getArea()}")

    print ("Enter Equilateral triangle side length (int): ")
    //val triSideLen = readln().toInt()
    (equilateralTriangle as EquilateralTriangle).setDimensions(readln().toInt())
    println("Shape Name: ${equilateralTriangle.name}")
    println("Dimension(s): ")
    equilateralTriangle.printDimesions()
    println("Area: ${equilateralTriangle.getArea()}")

}