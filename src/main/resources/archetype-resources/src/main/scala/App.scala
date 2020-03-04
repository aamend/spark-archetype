package ${package}

import org.apache.spark.sql.SparkSession

object App {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("${artifactId}").getOrCreate()
  }

}