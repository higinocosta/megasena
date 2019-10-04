package processos;

import java.awt.Component;

import javax.swing.JPanel;

public class bloquearLiberarCampos {
	
	public bloquearLiberarCampos(JPanel painel, boolean acao) {
	    Component[] componentes = painel.getComponents(); // altere para o nome da variavel do seu painel
	    for (Component componente : componentes) {
	        componente.setEnabled(acao);
	    }
	}
}
