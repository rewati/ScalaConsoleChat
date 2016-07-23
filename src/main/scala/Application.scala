import java.util.Date

/**
  * Created by Rewati Raman(rewati.raman@gmail.com).
  */
object Application extends App{
  print("server address: ")
  val server = scala.io.StdIn.readLine
  print("Chat room name: ")
  val chatroom = scala.io.StdIn.readLine
  print("User name: ")
  val user = scala.io.StdIn.readLine

  def server(s: String):String = {
    s
  }


  new Thread(new Runnable {
    def run() {
      while(true) {
        val msg = MessageQueueUtills.getMessageFromQueue(server(server),user, chatroom)
        if(msg != "null")
          println(msg)
        else {
          Thread.sleep(200)
        }
      }
    }
  }).start()

  for (ln <- io.Source.stdin.getLines) {
    MessageQueueUtills.sendMessageToQueue(server(server),chatroom,user+">>> "+ln)
  }

}
