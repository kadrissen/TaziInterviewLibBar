import com.example.Bar
import org.scalatest.FunSuite

class BarTest extends FunSuite{

  test( "Bar.add") {
    assert( Bar.add(3,4) === 7)
    assert(false)
  }

}
