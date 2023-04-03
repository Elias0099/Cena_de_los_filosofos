package Clase;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Filosofo implements Runnable {

    int id, res;
    Thread t;
    JButton filosofo;
    JLabel derecho;
    JLabel izquierdo;
    JLabel resultado;
    String proceso;
    JTextArea textArea;

    Filosofo(int id, JLabel izquierdo, JLabel derecho, JButton filosofo, JLabel resultado, JTextArea textArea) {  
        this.id = id;
        this.derecho = derecho;
        this.izquierdo = izquierdo;
        this.filosofo = filosofo;
        this.resultado = resultado;
        this.textArea = textArea;
        t = new Thread(this);
        t.start();

    }

    public void run() {
        for (int i = 0; i < 3; i++) { 
            synchronized (this.izquierdo) {
                synchronized (this.derecho) {
                    comer();
                }
            }
            pensar();
        }

    }

    void comer() {  
        derecho.setText("X"); //Tenedor ocupado.
        derecho.setForeground(Color.red);

        izquierdo.setText("X"); //Tenedor ocupado.
        izquierdo.setForeground(Color.red);

        filosofo.setText("Comiendo"); //Acción del Filósofo.
        filosofo.setBackground(new Color(135, 206, 235));

        res = Integer.parseInt(resultado.getText());
        res += 1;
        resultado.setText(String.valueOf(res));
        proceso = "Filósofo " + (id + 1) + ":" + " Está comiendo y utiliza sus tenedores.\n";
        textArea.append(proceso);
        try {
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
        }
        derecho.setText("O"); //Tenedor Libre.
        derecho.setForeground(Color.green);

        izquierdo.setText("O"); //Tenedor Libre.
        izquierdo.setForeground(Color.green);

        filosofo.setText("Pensando"); //Acción del Filósofo.   
        filosofo.setBackground(Color.blue);
        proceso = "Filósofo " + (id + 1) + ":" + " Para de comer y se queda pensando, entonces suelta sus tenedores.\n";
        textArea.append(proceso);
    }

    void pensar() {  
        derecho.setText("O"); //Tenedor libre.
        derecho.setForeground(Color.green);

        izquierdo.setText("O"); //Tenedor libre.
        izquierdo.setForeground(Color.green);

        filosofo.setText("Pensando"); //Acción del Filósofo.   
        filosofo.setBackground(new Color(255, 127, 80));

        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

}
