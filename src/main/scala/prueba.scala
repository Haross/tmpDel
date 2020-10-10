import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.NextiaJD
object prueba {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .master("local[*]")
      .config("spark.driver.memory", "9g")
      .config("spark.driver.maxResultSize", "9g")
      .getOrCreate()

      NextiaJD.getPredRuled3
    val a = spark.read.option("header", "true").option("inferSchema", "true").
      csv("/Users/javierflores/Documents/Research/Projects/FJA/Benchmark/share/testbedXS/datasetInformation_testbedXS.csv")
    a.show
  }
}
