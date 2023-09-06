package org.devops

//打印内容
//def PrintMes(content){
//    println(content)
//}

//颜色输出
def PrintMes(value,color){
    colors = ['red'    : "\033[30m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033[0m",
              'yellow' : "\033[33m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m",
              'green'  : "\033[32m >>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<< \033]0m"]
    ansiColor('xterm') {
        println{colors[color]}
    }
}
