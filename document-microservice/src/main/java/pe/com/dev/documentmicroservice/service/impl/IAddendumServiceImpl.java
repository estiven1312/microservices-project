package pe.com.dev.documentmicroservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.dev.documentmicroservice.model.Addendum;
import pe.com.dev.documentmicroservice.repository.IAddendumRepository;
import pe.com.dev.documentmicroservice.repository.ICrudRepository;
import pe.com.dev.documentmicroservice.service.IAddendumService;
@Service
@RequiredArgsConstructor
public class IAddendumServiceImpl extends ICrudImpl<Addendum, String> implements IAddendumService {

    private final IAddendumRepository addendumRepository;

    @Override
    public ICrudRepository<Addendum, String> getRepository() {
        return addendumRepository;
    }


}
