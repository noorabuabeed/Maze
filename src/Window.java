import javax.swing.*;

public class Window extends JFrame {

    public Window () {
        this.setSize(900 ,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Maze game");


        JLabel data = new JLabel("You have to reach the end");
        JLabel data2 = new JLabel(" before the time runs out");
        data.setBounds(0 , 0 ,20 , 20);
        this.add(data) ;
        data2.setBounds(0 , 1 , 20 , 20); //هني مني عارف الاحداثيات عشان يكونن تحت بعض بلزبط
        this.add(data2);


        JButton beginning = new JButton("the beginning");
        this.add(beginning) ;
        beginning.setBounds(1 , 300 , 120 , 40);


        JButton pause = new JButton("pause") ;
        this.add(pause);
        pause.setBounds(1 ,350 , 90 , 40);


    }
}
