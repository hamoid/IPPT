package com.github.hamoid.ippt

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JPanel

class SomeKindOfDialog(project: Project?) :
    DialogWrapper(project, true) {
    private var mainPanel: JPanel? = null

    init {
        title = "Settings"
        isResizable = true
        init()
    }

    override fun doOKAction() {
        super.doOKAction()
        println("ok")
    }

    override fun doCancelAction() {
        super.doCancelAction()
        println("cancel")
    }

    override fun createCenterPanel() = mainPanel
}