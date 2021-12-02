package com.maven.ktServer.demo.bean

import javax.persistence.*

@Entity
 data class UploadFile(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long=0,
    val oldFileName: String="",
    val fileType: String="",
    val fileSize: String="",
    val savePath: String="",
    val saveTime: String="",
    val descs: String="",
    val saveName: String=""
)