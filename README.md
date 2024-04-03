# **Artificial Intelligence**

### Neural Network - Autopilot Project

---

##### Ryan Harte

---

### **Introduction**

This project uses a Neural Network (NN) called ShipTrainer, to control a spaceship navigating through a scrolling tunnel autonomously. The main goal is for the NN to keep the ship flying without hitting the tunnel walls for at least 30 seconds, showcasing effective AI control of the ship.

### **Installation Setup Guide**

The following is a step by step guide on how you can clone this repository down on to your own machine and get it running. Please ensure you have the following prerequisites installed before continuing.

#### **Prerequisites**

Installation of `git` <br>
Installation of `Java Development Kit JDK (version 17+)`<br>

### **Step 1: Clone Repository:**

In order to clone the github repository, use the following command:<br>
`git clone https://github.com/The-Mad-Ryanosaurus/Neural-Network.git`<br>
The HTTP link can be found in the green code button at the top of this page also, under the HTTPS tab.
<br>

### **Step 2: Jar Files:**

Add the following aicme4j.jar file to the projects root directory.<br>
[Download the aicme4j.jar here](https://drive.google.com/file/d/1idkDpnAcCP_OnjjlShZEGK4zfp6_isJs/view?usp=drive_link)
<br>
Once that is done, do the following command, also in the root directory of the project, to create an ai.jar:<br>
`jar –cf ai.jar *`
<br>

### **Step 3: Jar Files - SET CLASSPATH:**

In the terminal in the root directory of the project do the following command:<br>
**Windows**<br>
`javac -cp ".;aicme4j.jar;ai.jar" src\ie\atu\sw\*.java`<br>
**MAC/Linux**<br>
`javac -cp ".:aicme4j.jar:ai.jar" src/ie/atu/sw/*.java`<br>
This command does the following:

- cp ".;aicme4j.jar;ai.jar" || ".:aicme4j.jar:ai.jar" sets the classpath to include the current directory (.), as well as the aicme4j.jar and ai.jar files. These are necessary as the Java files depend on classes and libraries contained within these JAR files.
src\ie\atu\sw\*.java tells the Java compiler (javac) to compile all .java files located in the src\ie\atu\sw\ directory.

### **Step 4: Running the Application:**

In the same terminal window as before, do the following: <br>
**Windows**<br>
`java -cp ".;src;aicme4j.jar;ai.jar" ie.atu.sw.Runner`<br>
**MAC/Linux**<br>
`java -cp ".:src:aicme4j.jar:ai.jar" ie.atu.sw.Runner`<br>
This command sets the classpath to include the compiled classes in the src directory, as well as the external JARs, and then runs the Runner class.
