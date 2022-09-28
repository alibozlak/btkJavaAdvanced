# Maven

- ### **Project Management Tool**
   - **jar** files management
- ### **Standart Project Template**
   - **Başka projelere adaptasyon kolaylığı**
- ### Build (Versiyon Takip Sistemi)
- ### **Repository Görevi de görür**. (Hibernate, Spring, etc.)

---

## Maven Repository :
1. [mvnrepository](https://mvnrepository.com) (daha kullanışlı)
2. [Search Maven](https://search.maven.org)

---

## Sample Maven Project :
(There are many project template.. We will chose beginner template.)
- **org.apache.maven.archetypes**  (Archetype = Template)
   - **maven-archetype-quickstart** (Version : 1.1)

### **Group Id** : com.companyname (com.abc)
### **Artifact Id** : projectname (intro)
### **Version** : 0.0.1-SNAPSHOT
### **Package** : com.companyname.projectname (com.abc.intro)

---

## Folder Structure :
- ### **src** 
   - main
      - java
         - **com.abc.intro** package
            - **App.java**
   - test 
      - java
         - **com.abc.intro** package
            - **AppTest.java** (junit kullanılıyor)
- ### target (project outputs : .class files)
- ### **pom.xml**

---

**pom.xml** dosyasına yeni bir **dependency** eklenip ve **dosya kaydedildiği anda** :
1. Maven yüklenecek olan paket için **önce local repositoryde var mı diye bakar**. 
2. **Eğer localde yoksa remote repositoryden local repositorye indirir**.
3. Local'den projeye dahil eder.

> ### Local repo (Windows OS) : **C:/users/ea/.m2/repository**