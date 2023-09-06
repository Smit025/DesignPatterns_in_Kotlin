package StructuralPattern.ProxyPattern

interface Website {
    fun getAccess()
}

class ActualWebsite : Website {
    override fun getAccess() {
        println("Got an access to this webiste")
    }

}

class WebsiteProxy(val url: String, private val token: String) : Website {
    override fun getAccess() {
        if (isValidToken()) {
            ActualWebsite().getAccess()
        }
    }

    private fun isValidToken(): Boolean {
        return token == "1234"
    }

}

fun main() {
    val website = "www.google.com"
    val websiteProxy = WebsiteProxy(website, "1234").getAccess()
}