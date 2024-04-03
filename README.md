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

### **Step 2: Jar Files:**

Add the following aicme4j.jar file to the projects root directory.<br>
[Download the aicme4j.jar here](https://drive.google.com/file/d/1idkDpnAcCP_OnjjlShZEGK4zfp6_isJs/view?usp=drive_link)
<br>
Once that is done, do the following command, also in the root directory of the project, to create an ai.jar:<br>
`jar –cf ai.jar *`
<br>

### **Step 3: Running the Application:**

Once the project has been cloned, enter the root directory and use the following commands:<br>
**Windows** (use semi-colons as delimiters)
`java -cp ".;./aicme4j.jar;./ai.jar" ie.atu.sw.Runner`
<br>
**Linux / Mac** (use colons as delimiters)
`java -cp ".:./aicme4j.jar:./ai.jar" ie.atu.sw.Runner`
