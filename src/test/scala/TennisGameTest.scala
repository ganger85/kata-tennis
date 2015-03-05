class TennisGameTest extends UnitSpec{

  "Points" can "be added to each player" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    victor.winBall()
    victor.winBall()
    sarah.winBall()
    victor.winBall()
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
    sarah.winBall()
    game.score should be("love, fifteen")
    victor.winBall()
    game.score should be("fifteen, fifteen")
  }
  "Thirty" should "be description for score 2" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    victor.winBall()
    victor.winBall()
    sarah.winBall()
    game.score should be("thirty, fifteen")
  }
  "Forty" should "be description for score 3" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    (1 to 3).foreach(x => victor.winBall())
    game.score should be("forty, love")
  }

  "Advantage" should "describe when least three points have been scored by each side and a player has one more point than his opponent" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val game = new TennisGame(victor, sarah)
    (1 to 3).foreach(x => victor.winBall())
    (1 to 4).foreach(x => sarah.winBall())
    game.score should be("advantage Sarah")
  }
}
