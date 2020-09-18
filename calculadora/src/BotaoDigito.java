import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoDigito extends Button implements ActionListener {
    Calculadora calc;

    // Constructor
    BotaoDigito(int x, int y, int largura, int altura, String legenda, Calculadora calc) {
        super(legenda);
        setBounds(x, y, largura, altura);
        this.calc = calc;
        this.calc.add(this);
        addActionListener(this);
    }

    static boolean charEmString(String s, char c) {
        return s.contains(String.valueOf(c));
    }

    public void actionPerformed(ActionEvent evento) {
        String textoTmp = ((BotaoDigito) evento.getSource()).getLabel();

        if (textoTmp.equals(".")) {
            if (calc.limpar) {
                calc.textoDisplay.setText("0.");
                calc.limpar = false;
            } else if (!charEmString(calc.textoDisplay.getText(), '.'))
                calc.textoDisplay.setText(calc.textoDisplay.getText() + ".");
        } else {
            int i = 0;
            try {
                i = Integer.parseInt(textoTmp);
                if (i != 0 || !calc.textoDisplay.getText().equals("0")) {
                    if (calc.limpar) {
                        calc.textoDisplay.setText("" + i);
                        calc.limpar = false;
                    } else
                        calc.textoDisplay.setText(calc.textoDisplay.getText() + i);
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro ao ler texto no display. Input invalido.");
            }
        }
    }
}
