
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author
 */
public class MainMVM {

    public static void main(String[] args) {
        short mem[] = new short[1025];
        int programa = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Programa: "));
        //Botao.main(args, mem);
        int enderecoDeCarga = 0;
        
        Programas programas = new Programas(mem);
        
        switch (programa) {
            case 1:
                mem = programas.programa1(enderecoDeCarga);
                break;
            case 2:
                mem = programas.programa2(enderecoDeCarga);
                break;
            case 3:
                mem = programas.prova1(enderecoDeCarga);
                break;
            case 4:
                mem = programas.programa3Fluxograma();
            default:
                programa = 0;
                break;
        }
        MVM.decodificador(mem, programa, 0);
    }
}