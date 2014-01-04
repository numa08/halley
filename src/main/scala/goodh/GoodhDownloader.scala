package net.numa08.goodh

import java.io.File
import java.net.URL

class GoodhImage(val url:URL) {

	def download(path:File) : Boolean = {
		//TODO:ディレクトリを作る
		//URLの逐次処理
		//ダウンローど
		false
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