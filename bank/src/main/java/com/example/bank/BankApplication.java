package com.example.bank;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQuery;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructType;


public class BankApplication {

	public static void main(String[] args) throws Exception {

        SparkSession spark = SparkSession.builder().appName("spark streaming").config("spark.master", "local").config("spark.sql.warehouse.dir", "file:///apps/").getOrCreate();

        
        spark.sparkContext().setLogLevel("ERROR");

        StructType schema = new StructType().add("age", DataTypes.IntegerType)
        		.add("job", DataTypes.StringType)
        		.add("marital", DataTypes.StringType)
        		.add("education", DataTypes.StringType)
        		.add("default", DataTypes.StringType)
        		.add("balance", DataTypes.IntegerType)
        		.add("housing", DataTypes.StringType)
        		.add("loan", DataTypes.StringType)
        		.add("contact", DataTypes.StringType)
        		.add("day", DataTypes.IntegerType)
        		.add("month", DataTypes.StringType)
        		.add("duration", DataTypes.IntegerType)
        		.add("campaign", DataTypes.IntegerType)
        		.add("pdays", DataTypes.IntegerType)
        		.add("previous", DataTypes.IntegerType)
        		.add("poutcome", DataTypes.StringType)
        		.add("y", DataTypes.StringType);

        Dataset<Row> rawData = spark.readStream().option("header","false").option("delimiter",";").format("csv").schema(schema).csv("/user/FinalProject/*");

        rawData.createOrReplaceTempView("bankdata");
        
        Dataset<Row> success = spark.sql("select max(age),min(age),avg(age) from bankdata");

        StreamingQuery query = success.writeStream().outputMode(OutputMode.Update()).format("console").start();
        
        query.awaitTermination(10);
        
	}
}