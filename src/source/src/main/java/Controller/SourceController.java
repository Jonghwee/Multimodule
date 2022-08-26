package Controller;

import DTO.TeamMember;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class SourceController {
    WebClient webClient = WebClient.create("http://localhost:8882");

    @GetMapping("/hello")
    public Mono<String> get(){

        return webClient.get()
                .uri("/hello")
                .retrieve()
                .bodyToMono(String.class);
    }

    @PostMapping("/member")
    public Mono<ResponseEntity<TeamMember>> post(){

        return  webClient.post()
                .uri("/member")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<TeamMember>() {
                });
    }
}
