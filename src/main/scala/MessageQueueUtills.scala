import scalaj.http.{Http, HttpRequest}

/**
  * Created by Rewati Raman(rewati.raman@gmail.com).
  */
object MessageQueueUtills {

  def getMessageFromQueue(server:String ,user: String, queueName: String): String = {
    val url = server+"/queue/"+queueName+"/consumer/"+user
    val request: HttpRequest = Http(url)
    val msg = request.execute().body
    msg
  }

  def sendMessageToQueue(server:String ,queueName: String, msg: String): Unit = {
    val url = server+"/queue/"+queueName
    val request: HttpRequest = Http(url).postData(msg).header("content-type", "text/plain")
    if(!msg.isEmpty)
      request.execute()
  }


}
