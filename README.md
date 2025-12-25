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
This Java program illustrates the implementation of a simple graphical user interface using Java Swing, emphasizing event handling and custom drawing techniques. The application is developed by extending the JFrame class to create the main window and using a BorderLayout to organize components efficiently. A custom JPanel, named DrawingPanel, is placed at the center to serve as the drawing area, while a control panel containing two buttons—“Draw Circle” and “Clear”—is positioned at the bottom of the frame. Event handling is achieved through the use of the ActionListener interface, enabling the program to respond to user interactions. When the “Draw Circle” button is clicked, a filled circle is drawn at a randomly generated position within the panel, ensuring that the drawing remains inside the visible area. Each circle’s position is stored using a Point object in an ArrayList, allowing multiple circles to be displayed simultaneously without overwriting previous drawings. The “Clear” button removes all stored circle positions and repaints the panel, restoring it to a blank state. Custom rendering is performed by overriding the paintComponent(Graphics g) method, where Graphics2D is used along with anti-aliasing to enhance visual quality. Overall, the program effectively demonstrates fundamental concepts of GUI development, event-driven programming, and custom graphics rendering in Java Swing, fulfilling the objectives of the lab assignment.
