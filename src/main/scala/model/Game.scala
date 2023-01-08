package model

enum Suit:
  case Diamonds, Hearts, Clubs, Spades

enum CardValue:
  case Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King

object CardValue:
  extension (cv: CardValue)
    def <(other: CardValue): Boolean = cv.ordinal < other.ordinal
    def >(other: CardValue): Boolean = cv.ordinal > other.ordinal

case class Card(value: CardValue, suit: Suit)

case class Deck(cards: Seq[Card])

case class Game(deck: Deck, players: Set[Player])
