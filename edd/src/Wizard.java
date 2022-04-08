public class Wizard {
    public static void main(String[] args) throws Exception {
        Lista<Integer> hola = new Lista<>();;
        
        for(int i=0; i < 3; i++){
            hola.add(i);
        }

        System.out.println(hola.toString());
    }
}
