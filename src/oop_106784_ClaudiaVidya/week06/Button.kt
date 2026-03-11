package oop_106784_ClaudiaVidya.week06

import com.sun.source.tree.CaseTree

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' clicked")
    }
}