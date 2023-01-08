package model

import model.User.UserId

case class User(id: UserId)

object User:
  opaque type UserId = String

  object UserId:
    def apply(s: String): UserId = s
