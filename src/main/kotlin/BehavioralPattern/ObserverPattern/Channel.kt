package BehavioralPattern.ObserverPattern

class Channel : YoutubeChannel {
    val list = mutableListOf<Observer>()
    override fun subscribe(user: User) {
        list.add(user)
    }

    override fun unsubscribe(user: User) {
        list.remove(user)
    }

    override fun uploadVideo(videoName: String) {
        for (user in list) {
            user.getNotified(videoName)
        }
    }
}