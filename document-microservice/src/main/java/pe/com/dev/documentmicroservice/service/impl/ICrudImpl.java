package pe.com.dev.documentmicroservice.service.impl;

import pe.com.dev.documentmicroservice.repository.ICrudRepository;
import pe.com.dev.documentmicroservice.service.ICrudService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class ICrudImpl<T, ID> implements ICrudService<T, ID> {

    public abstract ICrudRepository<T, ID> getRepository();

    @Override
    public Mono<T> save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public Mono<T> findById(ID id) {
        return getRepository().findById(id);
    }

    @Override
    public Mono<Boolean> deleteById(ID id) {
        return getRepository().findById(id).hasElement()
                .flatMap(exists -> {
                    if (!exists) {
                        return Mono.just(false);
                    }
                    return getRepository().deleteById(id).thenReturn(true);
                });
    }

    @Override
    public Flux<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Mono<T> update(ID id, T entity) {
        return getRepository().findById(id)
                .flatMap(existingEntity -> getRepository().save(entity));
    }
}
