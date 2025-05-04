package pe.com.dev.documentmicroservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ICrudRepository<T,ID> extends ReactiveMongoRepository<T, ID> {

}
