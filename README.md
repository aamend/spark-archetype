# Spark archetype

Maven archetype is a convenient way to create fully fledged Spark libraries at minimal cost. 
A Spark module called `com.aamend.spark.ml:my-awesome-module:2.0-SNAPSHOT` can be created as follows. 

```
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=com.aamend.spark \
    -DarchetypeArtifactId=archetype \
    -DarchetypeVersion=1.0 \
    -DgroupId=com.aamend.spark.ml \
    -DartifactId=my-awesome-module \
    -Dversion=2.0-SNAPSHOT
```

Generated project can be compiled as follows

`mvn clean package`

Should you need to include third parties dependencies, packaging shaded jar as follows

`mvn clean package -Pshaded`

Spark module can be validated as follows

`spark-submit --class ${groupId}.App target/${artifactId}.${version}.jar`

## Compile

`mvn clean install`