package org.devops

//颜色输出
def PrintMes(value,color){
    colors = ['red'    : "\033[1;31m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033[0m",
              'yellow' : "\033[1;33m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m",
              'blue'   : "\033[1;34m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m",
              'green'  : "\033[1;32m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m"]

    ansiColor('xterm') {
        println{colors[color]}
    }
}
