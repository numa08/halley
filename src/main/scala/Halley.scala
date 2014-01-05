package net.numa08

import com.twitter.util.Eval
import java.io.File
import java.net.URL
import net.numa08.goodh._
import net.numa08.utils.FileWrapper._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

trait urls {
  val urls = new ArrayBuffer[URL]

  def add(url: String):Unit = {
    urls += new URL(url)
  }
}

/** The launched conscript entry point */
class Halley extends xsbti.AppMain {
  def run(config: xsbti.AppConfiguration) = {
    Exit(Halley.run(config.arguments))
  }
}

object Halley {
  /** Shared by the launched version and the runnable version,
   * returns the process status code */
  def run(args: Array[String]): Int = {
    val halleyFile = new File("Halleyfile").asOpt
    val result = halleyFile match {
                    case Some(file) => {
                      val code = Source.fromFile(file).mkString("import net.numa08.urls\n", "", "")
                      val config = Eval[urls](code)
                      config.urls.foreach{u => val dir = u.toString.split("/").last
                                        new Goodh(u).imagePages.foreach(_.download(new File(dir)))
                                        }
                      0
                    }
                    case _ => {
                      sys.error("Halleyfile is not exists")
                      1
                    }
                  }
    
    result
  }
  /** Standard runnable class entrypoint */
  def main(args: Array[String]) {
    System.exit(run(args))
  }
}

case class Exit(val code: Int) extends xsbti.Exit
