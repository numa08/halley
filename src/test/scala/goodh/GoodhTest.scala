package net.numa08.goodh

import java.net.URL
import org.scalatest.FunSuite

class GoodhTest extends FunSuite {

	test("get page list") {
		val expection = 2
		val actual = new Goodh(new URL("http://g.e-hentai.org/g/661292/bf3623df52/")).pageCount
		assert(expection == actual)
	}

	test("get collspaned page list") {
		val expection = 43
		val actual = new Goodh(new URL("http://g.e-hentai.org/g/661440/d74c2d45b7/")).pageCount
		assert(expection == actual)
	}

	test("create images list") {
		val expection = List(new URL("http://g.e-hentai.org/s/ad9de06078/661292-1"),
							new URL("http://g.e-hentai.org/s/43331b52f3/661292-2"),
							new URL("http://g.e-hentai.org/s/767bb86613/661292-3"),
							new URL("http://g.e-hentai.org/s/54b34c8818/661292-4"),
							new URL("http://g.e-hentai.org/s/39ce769ece/661292-5"),
							new URL("http://g.e-hentai.org/s/bac001eed8/661292-6"),
							new URL("http://g.e-hentai.org/s/ef13f0fbd8/661292-7"),
							new URL("http://g.e-hentai.org/s/0707773561/661292-8"),
							new URL("http://g.e-hentai.org/s/de40c4ebe5/661292-9"),
							new URL("http://g.e-hentai.org/s/7bb0b7985e/661292-10"),
							new URL("http://g.e-hentai.org/s/52e615b38b/661292-11"),
							new URL("http://g.e-hentai.org/s/d0fe4803bd/661292-12"),
							new URL("http://g.e-hentai.org/s/e178b241b8/661292-13"),
							new URL("http://g.e-hentai.org/s/ad6234049e/661292-14"),
							new URL("http://g.e-hentai.org/s/fc1a1faa81/661292-15"),
							new URL("http://g.e-hentai.org/s/1b8011b1f1/661292-16"),
							new URL("http://g.e-hentai.org/s/eb144fd0ff/661292-17"),
							new URL("http://g.e-hentai.org/s/91144633a7/661292-18"),
							new URL("http://g.e-hentai.org/s/20afdb0c16/661292-19"),
							new URL("http://g.e-hentai.org/s/54ff9cb757/661292-20"), 
							new URL("http://g.e-hentai.org/s/b1a33361cf/661292-21"),
							new URL("http://g.e-hentai.org/s/4b50363f95/661292-22"),
							new URL("http://g.e-hentai.org/s/59d1ec0818/661292-23"),
							new URL("http://g.e-hentai.org/s/f8b9a4ee47/661292-24"),
							new URL("http://g.e-hentai.org/s/b302c8b702/661292-25"),
							new URL("http://g.e-hentai.org/s/c97bb89b01/661292-26"))
		val actual = new Goodh(new URL("http://g.e-hentai.org/g/661292/bf3623df52/")).imagePages
		assert(expection == actual)
	}

	test("creta image list in collspaned page") {
		val expection = 857
		val actual = new Goodh(new URL("http://g.e-hentai.org/g/661440/d74c2d45b7/")).imagePages.size
		assert(expection == actual)
	}
}