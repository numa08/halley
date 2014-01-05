package net.numa08.goodh

import java.io.File
import java.net.URL
import org.jsoup.Jsoup
import scala.io.Source
import scalax.io.JavaConverters._
import scalax.file.Path

class GoodhImage(val url:URL) {
	
	def download(dir:File) : Boolean = {
		val imageUrl = Jsoup.parse(url, 60 * 1000)
							.getElementById("img")
							.attr("src")
		val fileName = imageUrl.split("=").last.replaceAll("/", "_")
		val imagePath = Path.fromString(dir.toString + "/" + fileName)
		println(s"[INFO] Downloading ${fileName}")
		imagePath.write{new URL(imageUrl).asInput.bytes}
		true
	}

	override def equals(other : Any) : Boolean = {
		other match {
			case that : GoodhImage => {
				that.url == this.url
			}
			case _ => false
		}
	}

	override def toString(): String =  {
		url.toString()
	} 
	  
	
}