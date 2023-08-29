// Abstract Product: Button
interface Button {
    fun render()
}

// Concrete Products: WindowsButton, MacOSButton
class WindowsButton : Button {
    override fun render() {
        println("Rendering a Windows Button")
    }
}

class MacOSButton : Button {
    override fun render() {
        println("Rendering a macOS Button")
    }
}

// Abstract Product: Checkbox
interface Checkbox {
    fun render()
}

// Concrete Products: WindowsCheckbox, MacOSCheckbox
class WindowsCheckbox : Checkbox {
    override fun render() {
        println("Rendering a Windows Checkbox")
    }
}

class MacOSCheckbox : Checkbox {
    override fun render() {
        println("Rendering a macOS Checkbox")
    }
}

// Abstract Factory: GUIFactory
interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}

// Concrete Factories: WindowsFactory, MacOSFactory
class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}

class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacOSCheckbox()
    }
}

// Client code
class Application(private val guiFactory: GUIFactory) {
    fun createUI() {
        val button: Button = guiFactory.createButton()
        val checkbox: Checkbox = guiFactory.createCheckbox()

        button.render()
        checkbox.render()
    }
}

fun main() {
    val windowsFactory: GUIFactory = WindowsFactory()
    val macosFactory: GUIFactory = MacOSFactory()

    val appForWindows = Application(windowsFactory)
    appForWindows.createUI()

    val appForMacOS = Application(macosFactory)
    appForMacOS.createUI()
}
