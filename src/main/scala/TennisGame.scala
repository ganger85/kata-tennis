import com.sun.media.jfxmedia.events.PlayerStateEvent.PlayerState

class TennisGame(player1: Player, player2: Player) {

  val desc = Array("love", "fifteen", "thirty", "forty")

  def score = {
    if (isDeuce) "deuce"
    else {
      def leader = getLeader
      def looser = getLooser(leader _)

      if (isLeaderWinner(leader _, looser _)) "%s won".format(leader.noun)
      else if (player1.score <= 3 && player2.score <= 3) desc(player1.score) + ", " + desc(player2.score)
      else advantagePrint(leader)
    }

  }

  private def getLooser(leader: () => Player): Player = {
    if (leader() == player1) player2 else player1
  }

  private def getLeader: Player = {
    if (player1.score > player2.score) player1 else player2
  }

  private def isLeaderWinner(leader: () => Player, looser: () => Player): Boolean = {
    leader().score > 4 && leader().score - looser().score >= 2
  }

  private def isDeuce: Boolean = {
    player1.score >= 3 && player1.score == player2.score
  }

  private def advantagePrint(player: Player): String = {
    "advantage %s".format(player.noun)
  }
}


