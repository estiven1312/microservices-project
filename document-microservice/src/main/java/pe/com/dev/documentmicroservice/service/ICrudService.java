package pe.com.dev.documentmicroservice.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICrudService<T, ID> {

    Mono<T> save(T entity);

    Mono<T> findById(ID id);

    Mono<Boolean> deleteById(ID id);

    Flux<T> findAll();

    Mono<T> update(ID id, T entity);
}
