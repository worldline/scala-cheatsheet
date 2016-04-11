//wildcard import : 
import collection._ 

//selective imports
import collection.immutable.Vector
import collection.immutable.{ Vector, List }

// renames import to avoid conflict with types alreading in the scope
import java.util.{ List => JList } 	

// import all from java.util except Date.
import java.util.{ Date => _, _ }

// syntax to define a package container for functions, types
package object mypkg {
  type Predicate = Int => Boolean

  def abs(x: Int) = if (x > 0) x else -x
}