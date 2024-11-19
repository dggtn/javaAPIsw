  <header>
      <h1>Ejercicio Java con Integración de la API de Star Wars</h1>
  </header>

  <section>
      <h2>Descripción del Proyecto</h2>
      <p>Este proyecto tiene como objetivo integrar la API pública de Star Wars (SWAPI) en una aplicación Java. El propósito de este ejercicio es aprender a consumir una API RESTful desde Java, procesar los datos en formato JSON y mostrar información de personajes, naves y planetas de Star Wars en la consola.</p>
      <p>La API de Star Wars proporciona datos sobre el universo de Star Wars, como personajes, naves espaciales, vehículos y planetas, que son accesibles a través de solicitudes HTTP GET.</p>
  </section>

  <section>
      <h2>Objetivos del Proyecto</h2>
      <ul>
          <li>Aprender a hacer solicitudes HTTP en Java.</li>
          <li>Consumir una API RESTful y trabajar con respuestas en formato JSON.</li>
          <li>Procesar los datos JSON y mostrar información relevante de los personajes, naves y planetas de Star Wars.</li>
          <li>Familiarizarse con la biblioteca <strong>Java HTTP Client</strong> o <strong>Retrofit</strong> para realizar peticiones HTTP en aplicaciones Java.</li>
      </ul>
  </section>

  <section>
      <h2>Tecnologías Utilizadas</h2>
      <ul>
          <li><strong>Java 8+</strong>: Lenguaje de programación para desarrollar la aplicación.</li>
          <li><strong>SWAPI</strong>: API pública de Star Wars para obtener datos relacionados con el universo de Star Wars.</li>
          <li><strong>JSON</strong>: Formato de datos utilizado para representar la información obtenida de la API.</li>
          <li><strong>HttpClient (Java 11+)</strong> o <strong>Retrofit</strong>: Biblioteca para hacer peticiones HTTP a la API.</li>
          <li><strong>Gson</strong> o <strong>Jackson</strong>: Bibliotecas para parsear las respuestas JSON.</li>
      </ul>
  </section>

  <section>
      <h2>Instrucciones para Ejecutar el Proyecto</h2>
      <p>Sigue estos pasos para ejecutar este proyecto en tu máquina local:</p>
      <ol>
          <li><strong>Clona el repositorio:</strong>
              <pre>git clone https://github.com/tu_usuario/ejercicio-api-starwars.git</pre>
          </li>
          <li><strong>Accede al directorio del proyecto:</strong>
              <pre>cd ejercicio-api-starwars</pre>
          </li>
          <li><strong>Compila y ejecuta el proyecto:</strong>
              <p>Si usas Maven o Gradle, asegúrate de tener estas herramientas instaladas, luego ejecuta los siguientes comandos:</p>
              <pre>mvn clean install</pre>
              <pre>mvn exec:java</pre>
          </li>
          <p>Si usas un IDE como IntelliJ IDEA o Eclipse, puedes simplemente abrir el proyecto y ejecutarlo desde el IDE.</p>
      </ol>
  </section>

  <section>
      <h2>Ejemplo de Código</h2>
      <p>A continuación se muestra un ejemplo de código básico para consumir la API de Star Wars usando <strong>HttpClient</strong> de Java 11+:</p>
      <pre>
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class StarWarsApiClient {
  public static void main(String[] args) {
      try {
          // Crear cliente HTTP
          HttpClient client = HttpClient.newHttpClient();

          // Solicitar información de un personaje de Star Wars (ej. Luke Skywalker)
          HttpRequest request = HttpRequest.newBuilder()
                  .uri(new URI("https://swapi.dev/api/people/1/"))
                  .build();

          // Enviar solicitud y obtener respuesta
          HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

          // Parsear la respuesta JSON
          Gson gson = new Gson();
          Character character = gson.fromJson(response.body(), Character.class);

          // Mostrar información del personaje
          System.out.println("Nombre: " + character.getName());
          System.out.println("Altura: " + character.getHeight());
          System.out.println("Color de cabello: " + character.getHairColor());

      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}

class Character {
  private String name;
  private String height;
  private String hair_color;

  public String getName() {
      return name;
  }

  public String getHeight() {
      return height;
  }

  public String getHairColor() {
      return hair_color;
  }
}
      </pre>
      <p>En este ejemplo, se usa la clase <strong>HttpClient</strong> de Java 11 para realizar una solicitud GET a la API de Star Wars y obtener la información de un personaje (en este caso, Luke Skywalker). Luego, se parsea la respuesta JSON utilizando <strong>Gson</strong> para extraer y mostrar información relevante.</p>
  </section>

  <section>
      <h2>Contribuciones</h2>
      <p>Si deseas contribuir al proyecto, puedes seguir estos pasos:</p>
      <ol>
          <li><strong>Haz un fork del repositorio:</strong> Crea una copia del proyecto para hacer cambios en tu propio repositorio.</li>
          <li><strong>Crea una nueva rama:</strong> Asegúrate de crear una nueva rama con un nombre descriptivo, por ejemplo:
              <pre>git checkout -b feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Realiza los cambios necesarios:</strong> Agrega nuevas funcionalidades o mejora el código existente.</li>
          <li><strong>Haz commit de tus cambios:</strong>
              <pre>git commit -m "Descripción de los cambios realizados"</pre>
          </li>
          <li><strong>Sube tus cambios:</strong>
              <pre>git push origin feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Abre un pull request:</strong> Una vez subidos los cambios, abre un pull request para que los demás revisen tu código.</li>
      </ol>
  </section>

  <section>
      <h2>Licencia</h2>
      <p>Este proyecto está bajo la licencia <strong>MIT</strong>. Puedes ver los detalles en el archivo <code>LICENSE</code>.</p>
  </section>

  <section>
      <h2>Agradecimientos</h2>
      <p>Agradecemos a todos los colaboradores y a la comunidad de desarrolladores que contribuyen al mantenimiento de la API de Star Wars (SWAPI) que usamos en este proyecto.</p>
  </section>

</body>
</html>
