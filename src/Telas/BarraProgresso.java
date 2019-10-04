package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;  
  
public class BarraProgresso extends JPanel {  
  
    private static final long serialVersionUID = -3510692886926771783L;  
  
    JProgressBar pbar;  
    static final int MY_MINIMUM = 0;  
    static final int MY_MAXIMUM = 100;  
  
    public BarraProgresso() {  
        pbar = new JProgressBar();  
        pbar.setMinimum(MY_MINIMUM);  
        pbar.setMaximum(MY_MAXIMUM);  
        add(pbar);  
    }  
  
    public void atualizarBarra(int valor) {  
        pbar.setValue(valor);  
    }  
  
    public void ativarBarra() {  
  
  //      final BarraProgresso barra = new BarraProgresso();  
  
        JFrame frame = new JFrame("Criando COBINAÇÕES");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setContentPane(pbar);  
        frame.pack();  
        frame.setVisible(true);  
        frame.setLocation(400, 300);  
  
    }

	public JProgressBar getPbar() {
		return pbar;
	}

	public void setPbar(JProgressBar pbar) {
		this.pbar = pbar;
	}  
    
    
}  
