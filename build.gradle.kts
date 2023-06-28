plugins {
    java
    id("org.springframework.boot") version "2.7.12"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.5.8")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.1")
    runtimeOnly("com.mysql:mysql-connector-j")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // swagger 디펜던시
//    implementation("io.springfox:springfox-swagger2:3.0.0")
//    implementation("io.springfox:springfox-swagger-ui:3.0.0")
//    implementation("io.springfox:springfox-boot-starter:3.0.0")
//    implementation 'org.springdoc:springdoc-openapi-ui:1.7.0'

//	implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
//	implementation("javax.servlet:jstl")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:2.3.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
