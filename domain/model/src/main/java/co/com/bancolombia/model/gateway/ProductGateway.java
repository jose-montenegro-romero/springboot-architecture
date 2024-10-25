package co.com.bancolombia.model.gateway;

import co.com.bancolombia.model.Product;
import reactor.core.publisher.Flux;

public interface ProductGateway {

    Flux<Product> getProducts();
}
