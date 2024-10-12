import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el numero de la pleicula star wars que quiere consultar:  ");

        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        }catch(NumberFormatException e){
            System.out.println("Numero no encontrado "+e.getMessage());
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
