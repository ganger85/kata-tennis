import com.sun.media.jfxmedia.events.PlayerStateEvent.PlayerState

class TennisGame(player1: Player, player2: Player) {

  val desc = Array("love", "fifteen")

  def score = {
    desc(player1.score) + ", " + desc(player2.score)
  }


}
