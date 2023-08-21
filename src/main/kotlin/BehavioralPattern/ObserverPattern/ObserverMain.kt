package BehavioralPattern.ObserverPattern

fun main(){
    val user1 = User("Smit")
    val user2 = User("Andrew")
    val user3 = User("Elon")

    Channel().apply {
        subscribe(user1)
        subscribe(user2)
        subscribe(user3)
        uploadVideo("New Interview")
    }



}