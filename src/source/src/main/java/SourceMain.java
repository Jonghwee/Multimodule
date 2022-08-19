import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

public class SourceMain {
    WebClient webClient = WebClient.create("http://localhost:8888");

    WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = webClient.method(HttpMethod.GET);

    WebClient.RequestBodySpec
}
