package net.numa08.goodh

import java.net.URL
import org.jsoup.Jsoup
import scala.collection.JavaConversions._

class Goodh(url : URL) {

	def pageCount : Int = {
		//構成しているページの総数を取得する
		val pageCount = Jsoup.parse(url, 60 * 1000).body
							  .getElementsByClass("ptb").head
							  .getElementsByTag("tbody").head
							  .getElementsByTag("tr").head
							  .getElementsByTag("td").init.last
							  .getElementsByTag("a").head
							  .text.toInt
		pageCount
	}
	
	def imagePages : List[GoodhImage] = {
		val imagePages = for( i <- 0 to pageCount - 1) yield {
			val targetUrl = new URL(url.toString() + s"?p=${i}")
			val imagePages = Jsoup.parse(targetUrl, 60 * 1000).body
					 			  .getElementsByClass("gdtm")
					 			  .map{elem => val url = elem.getElementsByTag("div").head
					 							   		     .getElementsByTag("a").head
					 							   			 .attr("href")
					 					new GoodhImage(new URL(url))
					 				}
			imagePages.toList
		} 
		imagePages.toList.flatten
	}
}