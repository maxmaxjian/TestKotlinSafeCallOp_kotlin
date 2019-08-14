import java.net.URI

class Bar {

    fun bar(foo: Any?) {
        val name: String? = (foo as? Foo)?.mName.toString()
        println("name = $name")
    }
}

fun main(args: Array<String>) {
    val foo = Foo(URI("null.String"), 10)
    val bar = Bar()
    bar.bar(foo)
}