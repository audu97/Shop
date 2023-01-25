package com.example.ourshop.model

data class MUser(
    val id: String?,
    val userId: String,
    val displayName: String
){
    fun toMap(): MutableMap<String, Any>{
        return mutableMapOf(
            "userId" to this.userId,
            "display" to this.displayName,
        )
    }
}
