package BehavioralPattern.ObserverPattern

interface YoutubeChannel {
    fun subscribe(user: User)
    fun unsubscribe(user: User)
    fun uploadVideo(videoName: String)
}