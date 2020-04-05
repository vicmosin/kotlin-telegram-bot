package me.ivmg.telegram.entities

import com.google.gson.annotations.SerializedName as Name
import me.ivmg.telegram.entities.stickers.ChatPermissions

data class BotCommand(
    val command: String,
    val description: String
)
