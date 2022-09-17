import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    public Ventana()
    {
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setTitle("Mi programa de mierda");
        setResizable(true);
        setMinimumSize(new Dimension(200,200));
        this.getContentPane().setBackground(Color.white);
        iniciarComponentes();

    }

    private void iniciarComponentes()
    {
        JPanel panel=new JPanel();
        this.getContentPane().add(panel);
        //panel.setBackground(Color.GREEN);
        panel.setLayout(null);

        JLabel etiqueta=new JLabel();
        etiqueta.setText("Mundial 2018");
        panel.add(etiqueta);
        etiqueta.setBounds(0,10,500,50);
        etiqueta.setForeground(Color.black);
        etiqueta.setOpaque(true);
        //etiqueta.setBackground(Color.orange);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("cooper black", 0,40));

        JLabel imagen=new JLabel(new ImageIcon("C:/Users/User/IdeaProjects/untitled1/russia2018.jpg"));
        imagen.setBounds(95,60,300,320);
        panel.add(imagen);



    }
}
