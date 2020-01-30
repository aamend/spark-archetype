package ${package}

import org.apache.spark.sql.SparkSession

object App {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("${artifactId}")
      .getOrCreate()

    import spark.implicits._

    List("Sample application").toDF("test").show(1, false)

  }

}
