package pe.com.dev.documentmicroservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.dev.documentmicroservice.model.Addendum;
import pe.com.dev.documentmicroservice.model.Contract;
import pe.com.dev.documentmicroservice.repository.IAddendumRepository;
import pe.com.dev.documentmicroservice.repository.IContractRepository;
import pe.com.dev.documentmicroservice.repository.ICrudRepository;
import pe.com.dev.documentmicroservice.service.IAddendumService;
import pe.com.dev.documentmicroservice.service.IContractService;

@Service
@RequiredArgsConstructor
public class IContractServiceImpl extends ICrudImpl<Contract, String> implements IContractService {

    private final IContractRepository contractRepository;

    @Override
    public ICrudRepository<Contract, String> getRepository() {
        return contractRepository;
    }


}
