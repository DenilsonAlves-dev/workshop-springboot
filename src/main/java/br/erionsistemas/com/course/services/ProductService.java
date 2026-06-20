package br.erionsistemas.com.course.services;

import br.erionsistemas.com.course.entities.Order;
import br.erionsistemas.com.course.entities.Product;
import br.erionsistemas.com.course.repositories.OrderRepository;
import br.erionsistemas.com.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    //camada de serviços busca a informação na camada repository
    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
