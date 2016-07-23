import org.scalatest.FunSuite

/**
  * Created by Rewati Raman(rewati.raman@gmail.com).
  */
class MessageQueueUtills$Test extends FunSuite {

  test("testGetMessageFromQueue") {
    MessageQueueUtills.getMessageFromQueue("test2","qname")
  }

  test("testSendMessageToQueue") {
    MessageQueueUtills.sendMessageToQueue("qname","hfbvoweufhvew hbuvewouboewv ohbefvowevoubwefv")
  }

}
