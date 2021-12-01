package com.maven.ktServer.demo.bean

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UploadFile(
    val oldFileName: String,
    val fileType: String, val fileSize: String, val savePath: String,
    val saveTime: String, val desc: String, val saveName: String
) {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0
}