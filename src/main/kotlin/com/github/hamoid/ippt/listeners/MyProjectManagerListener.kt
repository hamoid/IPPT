package com.github.hamoid.ippt.listeners

import com.github.hamoid.ippt.SomeKindOfDialog
import com.github.hamoid.ippt.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()

        SomeKindOfDialog(project).show()
    }
}
