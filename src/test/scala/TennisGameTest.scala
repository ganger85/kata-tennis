/**
 * Created by arincon on 5/03/15.
 */
class TennisGameTest extends UnitSpec{

  "Points" can "be added to each player" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    victor.winBall
    victor.winBall
    sarah.winBall
    victor.winBall
    victor.score should be (3)
    sarah.score should be (1)
  }
}
