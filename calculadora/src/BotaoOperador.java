import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoOperador extends Button implements ActionListener {
    Calculadora calc;

    // Constructor
    BotaoOperador(int x, int y, int largura, int altura, String legenda, Calculadora calc) {
        super(legenda);
        setBounds(x, y, largura, altura);
        this.calc = calc;
        this.calc.add(this);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {
        String textoOperador = ((BotaoOperador) evento.getSource()).getLabel();

        calc.limpar = true;
        double tmp = Double.parseDouble(calc.textoDisplay.getText());

        if (!textoOperador.equals("=")) {
            calc.numero = tmp;
            calc.operador = textoOperador.charAt(0);
        } else {
            // processa o botao '=' sendo apertado
            switch (calc.operador) {
                case '+':
                    tmp += calc.numero;
                    break;
                case '-':
                    tmp = calc.numero - tmp;
                    break;
                case '*':
                    tmp *= calc.numero;
                    break;
                case '/':
                    try {
                        tmp = calc.numero / tmp;
                    } catch (ArithmeticException e) {
                        calc.textoDisplay.setText("Divisao por 0.");
                    }
                    break;
            }
            calc.textoDisplay.setText(Calculadora.formataTexto(tmp));
        }
    }
}
