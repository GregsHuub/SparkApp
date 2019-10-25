import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object SparkApp {
  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "My Own App")

    val lines: RDD[String] = sc.textFile("C:\\Users\\a769324\\Desktop\\Kurs SPARK z UDEMY\\DANE\\ml-100k\\ml-100k\\u.data")

    val mappedLine = lines.map(x => x.toString.split("\t")(2))
    val countedLine: collection.Map[String, Long] = mappedLine.countByValue()
    val sortedLines = countedLine.toSeq.sortBy(_._1).foreach(println)
    println("END OF TEST")
  }

}
