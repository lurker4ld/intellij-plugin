package com.github.lurker4ld.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.lurker4ld.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
