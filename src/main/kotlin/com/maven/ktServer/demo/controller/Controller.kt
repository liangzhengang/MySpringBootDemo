package com.maven.ktServer.demo.controller

import com.maven.ktServer.demo.config.FileStorageProperties
import com.maven.ktServer.demo.repository.FileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths


@Controller
class Controller {
    @Autowired
    lateinit var fileRepository: FileRepository
    @Autowired
    lateinit var fileStorageProperties: FileStorageProperties

    @RequestMapping("/home")
    fun home(model: ModelAndView): ModelAndView {
        model.viewName = "index.html"
        val file = fileRepository.findById(1).get()
        model.addObject("file", file)
        return model
    }

    @GetMapping("/upload")
    fun index(model: ModelMap): String {
        return "upload"
    }

    @PostMapping("/doUpload")
    fun singleFileUpload(@RequestParam("file") file: MultipartFile,
                         redirectAttributes: RedirectAttributes): String? {
        if (file.isEmpty) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload")
            return "index"
        }
        try { // Get the file and save it somewhere
            val bytes = file.bytes
            // UPLOADED_FOLDER 文件本地存储地址
            val path: Path = Paths.get(fileStorageProperties.uploadDir + file.originalFilename)
            Files.write(path, bytes)
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.originalFilename + "'")
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return "index"
    }

}