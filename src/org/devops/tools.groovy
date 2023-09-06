package org.devops

//颜色输出
def PrintMes(value,color){
    colors = ['red'    : "\033[31m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033[0m\n",
              'yellow' : "\033[33m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m\n",
              'blue'   : "\033[46m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m\n",
              'green'  : "\033[32m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m\n"]

    ansiColor('xterm') {
        println{colors[color]}
    }
}
printf "\e[31mHello\e[0m\n"
printf "\033[31mHello\033[0m\n"
printf "\x1b[31mHello\x1b[0m\n"
