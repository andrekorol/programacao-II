import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculadora extends Frame {
    public boolean limpar = true;
    double numero;
    char operador;

    String[] textoBotaoDigito = Stream.concat(IntStream.range(0, 10).mapToObj(String::valueOf),
            Arrays.stream(new String[]{"."})).toArray(String[]::new);

    String[] textoBotaoOperador = {"/", "*", "-", "+", "="};
    String[] textoBotaoEspecial = {"⌫", "C", "CE"};

    BotaoDigito[] botaoDigito = new BotaoDigito[textoBotaoDigito.length];
    BotaoOperador[] botaoOperador = new BotaoOperador[textoBotaoOperador.length];
    BotaoEspecial[] botaoEspecial = new BotaoEspecial[textoBotaoEspecial.length];

    Label textoDisplay = new Label("0", Label.RIGHT);

    final int LARGURA_QUADRO = 325, ALTURA_QUADRO = 325;
    final int LARGURA = 30, ALTURA = 30;
    final int ESPACO_HORIZONTAL = 10, ESPACO_VERTICAL = 10;
    final int TOPX = 30, TOPY = 50;

    // Constructor
    Calculadora(String textoQuadro) {
        super(textoQuadro);

        int tmpX = TOPX, y = TOPY;
        textoDisplay.setBounds(tmpX, y, 240, ALTURA);
        textoDisplay.setBackground(Color.BLUE);
        textoDisplay.setForeground(Color.WHITE);
        add(textoDisplay);

        // Coordenadas para os botoes especiais
        tmpX = TOPX + (LARGURA + ESPACO_HORIZONTAL);
        y = TOPY + (ALTURA + ESPACO_VERTICAL);
        for (int i = 0; i < botaoEspecial.length; i++) {
            botaoEspecial[i] = new BotaoEspecial(tmpX, y, LARGURA * 2, ALTURA, textoBotaoEspecial[i], this);
            botaoEspecial[i].setForeground(Color.RED);
            tmpX = tmpX + 2 * LARGURA + ESPACO_HORIZONTAL;
        }

        // Coordenadas para os botoes de digitos
        int digitoX = TOPX + LARGURA + ESPACO_HORIZONTAL;
        int digitoY = TOPY + 2 * (ALTURA + ESPACO_VERTICAL);
        tmpX = digitoX;
        y = digitoY;
        for (int i = 0; i < botaoDigito.length; i++) {
            botaoDigito[i] = new BotaoDigito(tmpX, y, LARGURA, ALTURA, textoBotaoDigito[i], this);
            botaoDigito[i].setForeground(Color.BLUE);
            tmpX += LARGURA + ESPACO_HORIZONTAL;
            if ((i + 1) % 3 == 0) { // Apenas 3 digitos por coluna
                tmpX = digitoX;
                y += ALTURA + ESPACO_VERTICAL;
            }
        }

        // Coordenadas para os botoes de operadores
        int opX = digitoX + 2 * (LARGURA + ESPACO_HORIZONTAL) + ESPACO_HORIZONTAL;
        tmpX = opX;
        y = digitoY;
        for (int i = 0; i < botaoOperador.length; i++) {
            tmpX += LARGURA + ESPACO_HORIZONTAL;
            botaoOperador[i] = new BotaoOperador(tmpX, y, LARGURA, ALTURA, textoBotaoOperador[i], this);
            botaoOperador[i].setForeground(Color.RED);
            if ((i + 1) % 2 == 0) { // Apenas 2 operadores por coluna
                tmpX = opX;
                y += ALTURA + ESPACO_VERTICAL;
            }
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        setSize(LARGURA_QUADRO, ALTURA_QUADRO);
        setVisible(true);
    }

    static String formataTexto(double tmp) {
        String resultado = "" + tmp;
        if (resultado.lastIndexOf(".0") > 0)
            resultado = resultado.substring(0, resultado.length() - 2);
        return resultado;
    }

    public static void main(String[] args) {
        new Calculadora("Calculadora - Andre Korol");
    }
}
