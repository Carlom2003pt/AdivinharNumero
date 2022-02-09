import javax.swing.*;
import java.util.Random;
public class AdivinharNumero {
    public static void main(String[] args)
    {
        Random rnd= new Random();
        int numEscondido=rnd.nextInt(100);
        int num=0;
        int tentativas=0;
        JOptionPane.showMessageDialog( null, "Tente adivinhar o número escondido (até 100)!");
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Número: "));
            tentativas=1 + tentativas;
            if(num>numEscondido)
                JOptionPane.showMessageDialog(null,"Tente um número menor!");
            else if(num<numEscondido)
                JOptionPane.showMessageDialog(null,"Tente um número maior!");
            else
                JOptionPane.showMessageDialog(null,"Parabéns! Adivinhou o numero: " + num + " em " + tentativas + " tentativas");
        }while(num!=numEscondido);
        System.exit(0);
    }
}
