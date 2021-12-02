package com.maven.ktServer.demo.repository

import com.maven.ktServer.demo.bean.UploadFile
import com.maven.ktServer.demo.controller.Controller
import org.springframework.data.repository.CrudRepository

interface FileRepository : CrudRepository<UploadFile, Long> {




}