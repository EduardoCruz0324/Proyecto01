public class Carta{

    // Colores de fondo
    String whiteBG = "\u001B[47m";
    // Colores de letra
    String red="\033[31m";
    String green="\033[32m";
    String yellow="\033[33m";
    String blue="\033[36m"; 
    String black="\u001B[30m";
    // Reset
    String reset="\u001B[0m";
 
    private int valor;
    private int figura;
    public final String[] figuras = new String[]{null, "amarillo", "rojo", "azul", "verde"};
    public final String[] dibujos = new String[]{null, yellow+" φ "+reset, red+" ψ "+reset, blue+" τ "+reset, green+" ξ "+reset};
    public final String[] valores = new String[]{null, " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " 11", " 12", " 13"};
 
    /**
     * Constructor para crear una carta a partir de un entero y un string
     * @param var1 - int para el valor de la carta
     * @param var2 - String para la figura de la carta
     */
    public Carta(int var1, String var2) {
       this.valor = var1 > 0 && var1 < 14 ? var1 : 0;
       this.figura = this.esFiguraValida(var2);
       if (this.figura == 0) {
          System.out.println("La figura " + var2 + " es incorrecta.");
       }
 
    }
 
    /**
     * Método para obtener la figura de la carta como string
     * @return figura de la carta
     */
    public String obtenerNombreFigura() {
       return this.figura > 0 && this.figura < 5 ? this.figuras[this.figura] : null;
    }
 
    /**
     * Método para obtener el valor de la carta como int
     * @return valor de la carta
     */
    public int getValor() {
       return this.valor;
    }
 
    /**
     * Método para saber si una figura es válida
     * @param var1 - figura que se desea saber
     * @return int - 0
     */
    public int esFiguraValida(String var1) {
       var1 = var1.trim().toLowerCase();
 
       for(int var2 = 1; var2 < this.figuras.length; ++var2) {
          if (this.figuras[var2].equals(var1)) {
             return var2;
          }
       }
 
       return 0;
    }
 
    /**
     * Método para imprimir el objeto y sus atributos
     * @return String - imprime en consola con formato
     */
    public String toString() {
       String valor="";
       if(this.obtenerNombreFigura().equals("amarillo")){
          valor = yellow+this.valores[this.valor]+reset;
       }else if(this.obtenerNombreFigura().equals("rojo")){
          valor = red+this.valores[this.valor]+reset;
       }else if(this.obtenerNombreFigura().equals("azul")){
          valor = blue+this.valores[this.valor]+reset;
       }else if(this.obtenerNombreFigura().equals("verde")){
          valor = green+this.valores[this.valor]+reset;
       }
       return reset + whiteBG + valor + whiteBG + this.dibujos[this.figura] + reset;
    }

    public static void main(String[] args) {
        
    }
 }
