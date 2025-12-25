**1.TITLE OF THE LAB REPORT EXPERIMENT:Graphical User Interfaces 

****
****2.OBJECTIVES:
1.We can use GUI to interact with applications visually instead of using the command line.
2.We can make applications user-friendly by using buttons, text fields, menus, etc.
3.We can display information and receive user input through the GUI.
4.We can respond to user actions through events such as mouse clicks and keyboard input.
5.We can improve the usability and appearance of applications by using GUI.
****
**3.Theory:
Java Graphical User Interfaces (GUIs) allow users to interact with programs using visual components like buttons and text fields instead of command-line input.
Java GUI development began with AWT (Abstract Window Toolkit), which uses heavyweight, OS-dependent components. This caused inconsistent appearance and behavior across platforms.
To overcome this, Swing was introduced as part of the Java Foundation Classes (JFC). Swing uses lightweight, Java-based components, providing a consistent look on all operating systems. It uses layout managers to arrange components and event handling to respond to user actions.
Later, JavaFX was developed as the modern GUI framework. It supports advanced graphics, multimedia, and CSS-based styling, making it suitable for modern and visually rich applications.
In general, Java GUI development involves creating a main window, adding components like buttons and text fields, and using event listeners to handle user interactions.
****

**4.PROCEDURE / ANALYSIS / DESIGN :
4.1: UML class diagram:
<img width="730" height="612" alt="image" src="https://github.com/user-attachments/assets/a61b3a61-7cac-4d64-9715-a7f25b5fd89e" />**
****
**5.IMPLEMENTATION:
GitHub Repository Link:
https://github.com/Rajbongshi2005/LabReport04-GUI.git**
****
6.TEST RESULT / OUTPUT:
<img width="634" height="326" alt="image" src="https://github.com/user-attachments/assets/e237ee74-44e5-4974-a266-8eb71b9adac8" />
<img width="629" height="307" alt="image" src="https://github.com/user-attachments/assets/f13dd1f8-22fc-4cdc-a72a-c4afa8e0dca5" />

****
7. ANALYSIS AND DISCUSSION: 
This program demonstrates the use of Multithreading in Java, where two threads operate simultaneously. It illustrates the two standard methods of thread creation: one thread is created by extending the Thread class, and the other is created by implementing the Runnable interface.
The first thread prints numbers from 1 to 10, while the second thread prints the squares of those numbers. A 500-millisecond delay is applied between each output, causing the outputs of both threads to interleave.
Both threads utilize a shared counter variable. To prevent data inconsistency, the method responsible for updating the counter has been synchronized, ensuring that only one thread can modify the counter at a time.
In summary, this program clearly explains the importance of multithreading, concurrent execution, and synchronization.




