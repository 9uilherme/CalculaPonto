package guilherme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaPonto extends javax.swing.JFrame {

    private JButton calcular;

    private JTextField displayEntrada;
    private JTextField displaySaida;
    private JTextField displayEntrada2;
    private JTextField displaySaida2;
    
    private JTextField displayResultado;
    
	public TelaPonto() {
		this.setTitle("Calculo Horário Trabalho");
		this.setBounds(0, 0, 315, 315);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(25, 125, 245, 30);
        this.add(calcular);

        displayEntrada = new JTextField();
        displayEntrada.setBounds(25, 25, 120, 30);
        this.add(displayEntrada);

        displaySaida = new JTextField();
        displaySaida.setBounds(150, 25, 120, 30);
        this.add(displaySaida);
        
        displayEntrada2 = new JTextField();
        displayEntrada2.setBounds(25, 75, 120, 30);
        this.add(displayEntrada2);

        displaySaida2 = new JTextField();
        displaySaida2.setBounds(150, 75, 120, 30);
        this.add(displaySaida2);
        
        displayResultado = new JTextField();
        displayResultado.setBounds(25, 175, 245, 30);
        this.add(displayResultado);
        
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

        		HorarioUtil horario = new HorarioUtil();
        		try {
        			horario.setEntradaSaida(displayEntrada.getText(), displaySaida.getText());
        			horario.setEntradaSaida(displayEntrada2.getText(), displaySaida2.getText());
        			
        		}finally {
        			displayResultado.setText(horario.calculaHorarioUtil());
        		}
        		
            }
        });
        
		
	}
}
