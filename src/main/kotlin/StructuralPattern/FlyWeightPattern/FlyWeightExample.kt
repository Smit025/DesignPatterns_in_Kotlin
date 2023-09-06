package StructuralPattern.FlyWeightPattern

import java.lang.IllegalArgumentException

interface Font {
    fun applyFont()
}

class ArialFont(val text:String) : Font {
    override fun applyFont() {
        println(text)
    }

}

class TimesNowFont(val text:String) : Font {
    override fun applyFont() {
        println(text)
    }

}

object FlyWeight {
    private val map = mutableMapOf<String, Font>()

    fun addFont(fontName: String,text:String): Font {
        return map.getOrPut(fontName) {
            when (fontName) {
                "Arial" -> ArialFont(text)
                "TimesNow" -> TimesNowFont(text)
                else -> throw IllegalArgumentException("Unsupported Font")
            }
        }
    }
}

fun main() {
    val textEditor = mutableListOf<Pair<String, String>>()

    textEditor.add(Pair("Adding Text for Arial", "Arial"))
    textEditor.add(Pair("Adding Text for TimesNow", "TimesNow"))
    textEditor.add(Pair("Optimizing Memory with Fly Weight", "Arial"))

    for (list in textEditor) {
        val text = list.first
        val fontName = list.second
        val font = FlyWeight.addFont(fontName,text)
        font.applyFont()
    }
}