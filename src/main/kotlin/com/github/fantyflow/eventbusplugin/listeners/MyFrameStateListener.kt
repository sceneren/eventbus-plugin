package com.github.fantyflow.eventbusplugin.listeners

import com.intellij.ide.FrameStateListener
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.wm.IdeFrame

internal class MyFrameStateListener : FrameStateListener {
    override fun onFrameActivated(frame: IdeFrame) {
        super.onFrameActivated(frame)
        thisLogger().warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
