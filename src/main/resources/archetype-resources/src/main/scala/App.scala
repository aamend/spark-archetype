package ${package}

import org.apache.spark.sql.{DataFrame, SparkSession}

object App {

  def generateDataframe(spark: SparkSession): DataFrame = {
    import spark.implicits._
    List("${groupId}:${artifactId}:${version}").toDF("maven")
  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("spark-test").getOrCreate()
    generateDataframe(spark).show(1, truncate = false)
  }

}