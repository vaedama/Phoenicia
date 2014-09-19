package models

case class User(firstName: String, lastName: String, age: Int)

object JsonFormats {
  import play.api.libs.json.Json

  // Generates Writes and Reads for User
  implicit val userFormat = Json.format[User]
}