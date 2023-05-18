import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        JFrame myWindow = new JFrame("Central window"); // create the window with a title
        myWindow.setBounds(0, 0, 600, 300); // set the size and location of the window
        myWindow.setLocationRelativeTo(null); // center the window on the screen
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true); // make the window visible
        myWindow.setExtendedState(JFrame.ICONIFIED);
        System.out.println(myWindow.getBounds());
        System.out.println(myWindow.getLocation());
        System.out.println(myWindow.getExtendedState());


        JFrame myWindow2 = new Main();
        myWindow2.setTitle("Central window");
        myWindow2.setSize(600, 300);
        myWindow2.setLocationRelativeTo(null);
        myWindow2.setVisible(true);
        myWindow2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow2.setResizable(false);
        myWindow2.setExtendedState(JFrame.ICONIFIED);
        System.out.println(myWindow2.getSize());
        System.out.println(myWindow2.getLocation());
        System.out.println(myWindow2.getExtendedState());

    }
}