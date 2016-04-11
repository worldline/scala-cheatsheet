class C(x: Int)
val c = new C(4) // instanciation

//same as 
class D(private val x: Int)
// (x is a constructor param and private member)
val d = new D(4)

class E(val x: Int)
// x is now also a public member
var e = new E(4)
e.x

class F(var x: Int) { // x is now modifiable
  assert(x > 0, "positive please") //class body == constructor

  def y = x //declare a public member
  val readonly = 5 // declare a gettable but not settable member
  private var secret = 1 // declare a private member
  def this() = this(42) // alternate constructor, calls primary constructor
}

List(1, 2, 3) // factory method in companion object
val cl = classOf[String] //class literal (java String.class)

val isString = c.isInstanceOf[String] // type check (runtime)
val myString = c.asInstanceOf[String] // cast (runtime)

// companion object
object F {
  def apply(v: Int) = new F(v)
}

val one = new F(1) // Default constructor. 
val two = F(2)     // Using the "apply" method defined in the companion object.

val s = new { val x = 2 } //anonymous class
println(s.x)
                        
abstract class Abstract(i: Int) { // non-instanciable 
  def prop: Int //abstract method}	
}

class Concrete(i: Int) extends Abstract(i) { // inherited class with call to super constructor 
  def prop = i //implements the abstract method
}

object Singleton extends Concrete(5)

trait T { def m: String } // purely abstract, like an interface
trait U { val n = "toto" } // traits can have concrete implementation
class Mixin extends Concrete(5) with T with U { // multiple inheritance
  val m = "hello" // a val or var can implement a def
  override def toString = "my mixin"
}