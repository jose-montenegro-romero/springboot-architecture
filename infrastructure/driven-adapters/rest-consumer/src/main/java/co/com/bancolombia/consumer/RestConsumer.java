package co.com.bancolombia.consumer;

import co.com.bancolombia.consumer.helper.ProductHelper;
import co.com.bancolombia.model.Product;
import co.com.bancolombia.model.gateway.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class RestConsumer implements ProductGateway {
    private final WebClient client;

//    @CircuitBreaker(name = "testPost")
//    public Mono<ObjectResponse> testPost() {
//        ObjectRequest request = ObjectRequest.builder()
//            .val1("exampleval1")
//            .val2("exampleval2")
//            .build();
//        return client
//                .post()
//                .body(Mono.just(request), ObjectRequest.class)
//                .retrieve()
//                .bodyToMono(ObjectResponse.class);
//    }

    @Override
    public Flux<Product> getProducts() {
        return client
                .get()
                .uri("products")
                .retrieve()
                .bodyToFlux(ProductDTO.class)
//                .map(productDTO -> ProductHelper.getProduct(productDTO))
                .map(ProductHelper::getProduct);
    }
}
