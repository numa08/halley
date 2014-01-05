package net.numa08.goodh

import java.io.File
import java.net.URL
import org.scalatest.FunSuite

class GoodhImageTest extends FunSuite {

	test("download image") {
		val result = new GoodhImage(new URL("http://g.e-hentai.org/s/094f611654/344872-18"))
					.download(new File("img"))
		assert(result)
	}
}