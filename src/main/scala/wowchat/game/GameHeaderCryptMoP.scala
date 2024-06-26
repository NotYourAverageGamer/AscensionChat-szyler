package wowchat.game

/**
  * This class provides functionality for encrypting and decrypting game headers specific to
  * World of Warcraft: Mists of Pandaria (MoP) expansion.
  *
  * It extends the GameHeaderCryptWotLK class and provides custom HMAC seeds.
  */
class GameHeaderCryptMoP extends GameHeaderCryptWotLK {

  /**
    * Server HMAC seed for MoP expansion.
    */
  override protected val serverHmacSeed: Array[Byte] = Array(
    0x08, 0xF1, 0x95, 0x9F, 0x47, 0xE5, 0xD2, 0xDB, 0xA1, 0x3D, 0x77, 0x8F, 0x3F, 0x3E, 0xE7, 0x00
  ).map(_.toByte)

  /**
    * Client HMAC seed for MoP expansion.
    */
  override protected val clientHmacSeed: Array[Byte] = Array(
    0x40, 0xAA, 0xD3, 0x92, 0x26, 0x71, 0x43, 0x47, 0x3A, 0x31, 0x08, 0xA6, 0xE7, 0xDC, 0x98, 0x2A
  ).map(_.toByte)
}
