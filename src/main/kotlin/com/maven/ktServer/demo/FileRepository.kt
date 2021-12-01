package com.maven.ktServer.demo

import com.maven.ktServer.demo.bean.UploadFile
import org.springframework.data.repository.CrudRepository

interface FileRepository : CrudRepository<UploadFile, Long> {

    fun save(file: UploadFile)
}