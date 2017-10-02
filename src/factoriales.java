public class factoriales {
    public static void main(String[] args){
        System.out.println(factoriales(5));
    }

    public static int  factoriales (int i) {
        int resultado = 1;
        for (int n = 1; n <= i; n++) {
            resultado = resultado* n;
        }
        return resultado;
    }
}
