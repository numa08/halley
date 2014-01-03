package net.numa08.utils

import java.io.File

object FileWrapper {
  implicit class FileWrapper(val file:File) extends AnyVal {
    def asOpt : Option[File] = {
    	val retval = if(file.exists){
    					Some(file)
    				 } else {
    					None
    				 }
    	retval
    }
  }
}
