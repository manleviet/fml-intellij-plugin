package com.github.manleviet.fmlintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.manleviet.fmlintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
