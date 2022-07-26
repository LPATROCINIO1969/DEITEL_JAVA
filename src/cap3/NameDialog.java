package cap3;
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        String message = String.format("Bem vindo, %s, a aula de JAVA!",name);

        JOptionPane.showMessageDialog(null,message);

    }
}
