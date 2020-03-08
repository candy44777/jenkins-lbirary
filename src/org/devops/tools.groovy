package org.devops

// 格式化输出
def PrintMes(value,color) {
  colors = ['red'    : "\033[40;31m >>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m",
            'bule'   : "\033[47,34m >>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m",
            'green'  : "\033[1;32m >>>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m",
            'green'  : "\033[40;32m >>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<< \033[0m" ]
  ansiColor('gnome-terminal') {
    println(colors[color])
  }
}
