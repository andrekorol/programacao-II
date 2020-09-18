import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoEspecial extends Button implements ActionListener {
    Calculadora calc;

    // Constructor
    BotaoEspecial(int x, int y, int largura, int altura, String legenda, Calculadora calc) {
        super(legenda);
        setBounds(x, y, largura, altura);
        this.calc = calc;
        this.calc.add(this);
        addActionListener(this);
    }

    // Backspace
    static String voltar(String s) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++)
            resultado.append(s.charAt(i));
        return resultado.toString();
    }

    public void actionPerformed(ActionEvent evento) {
        String textoOperador = ((BotaoEspecial) evento.getSource()).getLabel();
        if (textoOperador.equals("⌫")) {
            String textoTmp = voltar(calc.textoDisplay.getText());
            if (textoTmp.equals(""))
                calc.textoDisplay.setText("0");
            else
                calc.textoDisplay.setText(textoTmp);
        } else {
            if (textoOperador.equals("C")) {
                calc.numero = 0.0;
                calc.operador = ' ';
                calc.textoDisplay.setText("0");
            } else {
                // CE foi pressionado
                calc.textoDisplay.setText("0");
                calc.limpar = true;
            }
        }
    }
}
