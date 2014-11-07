import org.scalatest._

class HelloSpec extends FlatSpec {
  "Hello.add" should "add two integers" in {
    assert(Hello.add(1, 1) == 2)
    assert(Hello.add(1, 2) == 3)
    assert(Hello.add(8, 5) == 13)
    assert(Hello.add(1245, 2368) == 3613)
    assert(Hello.add(35, -60) == -25)

    // uncomment to make the test fail
  //  assert(Hello.add(2, 2) == 5)
  }
}
