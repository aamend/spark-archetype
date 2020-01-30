# Spark archetype

Maven archetype is a convenient way to create fully fledged Spark libraries at minimal cost. 
A Spark module called `com.aamend.spark.ml:my-awesome-module:2.0-SNAPSHOT` can be created as follows. 

```
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=com.aamend.spark \
    -DarchetypeArtifactId=archetype \
    -DarchetypeVersion=1.0-SNAPSHOT \
    -DgroupId=com.aamend.spark.ml \
    -DartifactId=my-awesome-module \
    -Dversion=2.0-SNAPSHOT
```