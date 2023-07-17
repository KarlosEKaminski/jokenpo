package Principal;

import Model.Computador;
import Model.Usuario;
import View.TelaPrincipal;

public class Principal {

    public static void main(String[] args) throws Exception {

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        Computador comp = new Computador();
        Usuario user = new Usuario();

        comp.regras();

    }

}
