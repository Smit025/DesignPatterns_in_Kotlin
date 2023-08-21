package BehavioralPattern.ObserverPattern

class User(private val name: String) : Observer {
    override fun getNotified(videoName: String) {
        println("Video $videoName is uploaded by $name")
    }
}