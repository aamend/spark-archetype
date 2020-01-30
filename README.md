# Spark archetype

Maven archetype is a convenient way to create fully fledged SPARK libraries at minimal cost. 
A Spark module called `my-awesome-module` can be created as follows. 

```
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=com.aamend.spark \
    -DarchetypeArtifactId=archetype \
    -DarchetypeVersion=1.0-SNAPSHOT \
    -DgroupId=com.aamend.spark \
    -DartifactId=my-awesome-module \
    -Dversion=2.0-SNAPSHOT
```