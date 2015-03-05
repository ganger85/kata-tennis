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
  "Love" should "be description for score 0" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    game.score should be("love, love")
  }
  "Fifteen" should "be description for score 1" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    sarah.winBall
    game.score should be("love, fifteen")
  }
}
