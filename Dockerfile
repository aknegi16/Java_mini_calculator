FROM openjdk:11
ADD target/spe-assign-calculator-0.0.1-SNAPSHOT.jar spe-assign-calculator-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","spe-assign-calculator-0.0.1-SNAPSHOT.jar"]
