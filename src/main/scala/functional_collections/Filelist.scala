package functional_collections

import java.security.KeyPair

object Filelist {

  def main (args: Array[String]) = {

   val fileList =  (new java.io.File(".")).listFiles
   // Q1
//    fileList.filter(item => !item.isHidden).foreach(item => println(item.getAbsoluteFile))
    val directoryContentNames = fileList.filter(item => !item.isHidden).map(item => item.getAbsoluteFile)
    println(directoryContentNames.mkString("Array(", ", ", ")"))

    // Q2 a
    val files = fileList.filter(item => item.isFile)
    println(files.mkString("Array(", ", ", ")"))

    // Q2 b
    val directories = fileList.filter(item => item.isDirectory )
    println(directories.mkString("Array(", ", ", ")"))

    // Q3
   val nameSizePair = fileList.map(item => (item.getAbsoluteFile, item.length()))
   println(nameSizePair.mkString("Array(", ", ", ")"))

   // Q4 a
   val tenSmallestFiles = fileList.map(item => (item.getAbsoluteFile, item.length())).sorted
   println(tenSmallestFiles.mkString("Array(", ", ", ")"))

   // Q4 b
   val tenLargestFiles = fileList.map(item => (item.getAbsoluteFile, item.length())).reverse
   println(tenLargestFiles.mkString("Array(", ", ", ")"))

   // Q5
   val tenLargestFilesMap = fileList.map(item => Map(item.getAbsoluteFile -> item.length())).reverse
   println(tenLargestFilesMap.mkString("Array(", ", ", ")"))

  }

}
