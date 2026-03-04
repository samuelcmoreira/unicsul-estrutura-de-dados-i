import java.util.ArrayList;
import java.util.List;

public class GaleriaFotos {
    public static void main(String[] args) {
        List<byte[]> fotosNaMemoria = new ArrayList<>();
        int cont = 0;

        while (true) {
            // Simula uma foto de 10MB (10 * 1024 * 1024 bytes)
            byte[] fotoAltaResolucao = new byte[10 * 1024 * 1024];

            fotosNaMemoria.add(fotoAltaResolucao);
            cont++;

            System.out.println("Fotos carregadas: " + cont + " (" + (cont * 10) + " MB)");
        }
    }
}