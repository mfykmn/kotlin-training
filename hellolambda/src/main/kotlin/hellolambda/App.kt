/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package hellolambda

class App {
    val greeting: String
        get() {
            return "Hello world."
        }

    public fun handler(): String {
        return App().greeting
    }
}