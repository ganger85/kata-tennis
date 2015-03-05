import com.sun.media.jfxmedia.events.PlayerStateEvent.PlayerState

class TennisGame(player1: Player, player2: Player) {

  val desc = Array("love", "fifteen", "thirty", "forty")

  def score = {
    if (player1.score <= 3 && player2.score <= 3)
      desc(player1.score) + ", " + desc(player2.score)
    else if (player1.score > player2.score) "advantage %s".format(player1.noun) else "advantage %s".format(player2.noun)
  }


}
