package org.devops

//颜色输出
def PrintMes(value,color){
    colors = ['red'    : "\e[31m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \e[0m\n",
              'yellow' : "\e[33m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \e]0m\n",
              'blue'   : "\e[46m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \e]0m\n",
              'green'  : "\e[32m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \e]0m\n"]

    ansiColor('xterm') {
        println{colors[color]}
    }
}
