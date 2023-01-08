package model

import User.UserId

case class Player(id: UserId, hand: Seq[Card])
